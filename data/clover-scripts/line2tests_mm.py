from bs4 import BeautifulSoup

import glob
import json
import re
import sys

REPORT_PATH = "/target/site/clover/"
TEST_CLASS_PATH = "/target/clover/src-test-instrumented/"
SEARCH_STRING_IN_JS_FILE = "clover.testTargets = "

def merge_dicts(dict_to_add, output_dict):
  """
  Merge two dictionary objects
  :param dict_to_add: the smaller dict
  :param output_dict: the dict in which to add the smaller dict
  :return: the updated output_dict
  """
  for key, value in dict_to_add.items():
    if (output_dict.get(key)) is None:
      output_dict[key] = value
    else:
      output_dict.get(key).extend(value)
  return output_dict

def get_test_fqn_from_html(file, test_id):
  """
  Parse html files to get fully qualified names
  of test methods, update the dictionary of test ids with
  test case fqns
  :param file: the name of the .js file corresponding to which
  an html file will be parsed
  :param test_id: an id of the form test_\d+
  :return: the fqn of the test method
  """
  file = file.replace(".js", ".html")
  tc_id = test_id.replace("test_", "tc-")
  with open(file) as f:
    soup = BeautifulSoup(f, 'html.parser')
    td_with_id = soup.find("td", {"id": tc_id})
    test_fqn = td_with_id.span.text
    test_case_fqns[test_id] = test_fqn
    return test_fqn

def sanitize_file_name(base_path, file_name):
  """
  Obtain the fully qualified name of a source file
  from the name of a clover-generated .js file
  :param base_path: path to clover reports for this module
  :param file_name: the path to the current .js file
  :return:
  """
  file_name = file_name.replace(base_path, "")
  file_name = file_name.replace(".js", "")
  file_name = file_name.replace("/", ".")
  return file_name

def exclude_test_classes(base_path):
  """
  Find all clover-generated src-test-instrumented files
  so that we can exclude them from the report
  :param base_path: path to clover reports for this module
  :return: list of files (related to test classes) that
  we will exclude from the report
  """
  test_files = []
  base_path_for_test_sources = base_path.replace(REPORT_PATH, TEST_CLASS_PATH)
  path = base_path_for_test_sources + "**/"
  test_classes = glob.glob(path + "*.java", recursive=True)
  for c in test_classes:
    c = c.replace(base_path_for_test_sources, base_path)
    c = c.replace(".java", ".js")
    test_files.append(c)
  return test_files

def find_clover_reports(base_path):
  """
  Get all clover-generated .js files for each source class
  :param base_path: path to clover reports for this module
  :return: list of .js files for source classes
  """
  path = base_path + "**/"
  test_files = exclude_test_classes(base_path)
  js_files = glob.glob(path + "*.js", recursive=True)
  js_files_for_source = []
  for f in js_files:
    if re.search("\/[A-Z].*.js", f) and f not in test_files:
      js_files_for_source.append(f)
  return js_files_for_source

def parse_extracted_json(file, name, extracted):
  """
  Extract and parse the JSON in the clover-generated
  .js file
  :param name: the fqn of a source class
  :param extracted: the extracted string with the JSON
  :return: a dictionary with the report for this file
  """
  file_report = {}
  all_test_ids = re.findall(r"test_\d+", extracted)
  data = json.loads(extracted)
  for test_id in all_test_ids:
    test_report = {}
    if test_case_fqns.get(test_id) is None:
      test_fqn = get_test_fqn_from_html(file, test_id)
    else:
      test_fqn = test_case_fqns.get(test_id)
    for sl in data[test_id]["statements"]:
      test_report[name + "#" + str(sl["sl"])] = [test_fqn]
    file_report = merge_dicts(test_report, file_report)
  return file_report

def extract_json_from_file(name, file):
  """
  Extract testTargets JSON from a single clover-generated
  .js file which corresponds to a source class
  :param name: the sanitized fqn of the source class
  :param file: the .js file being analyzed
  :return:
  """
  with open(file) as f:
    for line in f:
      if SEARCH_STRING_IN_JS_FILE in line:
        return parse_extracted_json(file, name, line.replace(SEARCH_STRING_IN_JS_FILE, ""))

def generate_report(base_path, files):
  """
  Generate a report for the source files in the current module
  :param base_path: path to clover reports for this module
  :param files: all the .js files that will be included in the report
  :return: a dictionary object with the report for this module
  """
  module_report = {}
  for file in files:
    sanitized_name = sanitize_file_name(base_path, file)
    file_report = extract_json_from_file(sanitized_name, file)
    module_report = merge_dicts(file_report, module_report)
  return module_report

def get_report_paths_for_multiple_modules():
  """
  Find paths to clover reports for each module
  :return: list of all ./**/target/site/clover/
  """
  modules = []
  paths = glob.glob("./**/" + TEST_CLASS_PATH, recursive=True)
  if len(paths) == 0:
    print("No clover reports found")
    print("Generate with `mvn clean clover:setup test clover:aggregate clover:clover`")
    sys.exit()
  for p in paths:
    modules.append(p.replace(TEST_CLASS_PATH, REPORT_PATH))
  return modules

def main():
  global test_case_fqns
  test_case_fqns = {}
  aggregate_report = {}
  try:
    base_paths = get_report_paths_for_multiple_modules()
    for base_path in base_paths:
      found_files = find_clover_reports(base_path)
      module_report = generate_report(base_path, found_files)
      aggregate_report = merge_dicts(module_report, aggregate_report)
    report_path = "./line2tests.csv"
    with open(report_path, 'w') as f:
      f.write("class#line,tests\n")
      for key in aggregate_report.keys():
        f.write("%s,\"%s\"\n" % (key, set(aggregate_report[key])))
    print("line2tests report generated:", report_path)

  except Exception as e:
    print(e)
    sys.exit()

if __name__ == "__main__":
  main()
