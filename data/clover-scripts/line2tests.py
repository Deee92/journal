import glob
import json
import os
import re
import sys

def sanitize_file_name(f):
  f = f.replace(base_path, "")
  f = f.replace(".js", "")
  f = f.replace("/", ".")
  return f

def exclude_test_classes():
  test_files = []
  base_path_for_test_sources = "./target/clover/src-test-instrumented/"
  path = base_path_for_test_sources + "**/"
  test_classes = glob.glob(path + "*.java", recursive=True)
  for c in test_classes:
    c = c.replace(base_path_for_test_sources, base_path)
    c = c.replace(".java", ".js")
    test_files.append(c)
  return test_files

def find_clover_reports():
  path = base_path + "**/"
  test_files = exclude_test_classes()
  js_files = glob.glob(path + "*.js", recursive=True)
  js_files_for_source = []
  for f in js_files:
    if re.search("\/[A-Z].*.js", f) and f not in test_files:
      js_files_for_source.append(f)
  return js_files_for_source

def parse_extracted_json(name, extracted):
  merged_result = {}
  all_test_ids = re.findall(r"test_\d+", extracted)
  data = json.loads(extracted)
  for test_id in all_test_ids:
    result = {}
    test_name = data[test_id]["name"]
    for sl in data[test_id]["statements"]:
      result[name + "#" + str(sl["sl"])] = test_name
    for key, value in result.items():
      if (merged_result.get(key)) is None:
        merged_result[key] = [value]
      else:
        merged_result.get(key).append(value)
  return merged_result

def extract_json_from_file(name, file):
  search_string = "clover.testTargets = "
  with open(file) as f:
    for line in f:
      if search_string in line:
        return parse_extracted_json(name, line.replace(search_string, ""))

def generate_report(files):
  report = {}
  report_path = "./line2tests.csv"
  print("Generating line2tests report:", report_path)
  for file in files:
    sanitized_name = sanitize_file_name(file)
    result = extract_json_from_file(sanitized_name, file)
    for key, value in result.items():
      if (report.get(key)) is None:
        report[key] = value
      else:
        report.get(key).extend(value)
  with open(report_path, 'w') as f:
    f.write("class#line,tests\n")
    for key in report.keys():
      f.write("%s,\"%s\"\n" % (key, set(report[key])))

def generate_report_if_not_exists():
  if (not os.path.isdir(base_path)):
    print("Did not find clover reports at", base_path)
    print("Generating reports now...")
    cmd = "mvn clean clover:setup test clover:aggregate clover:clover"
    os.system(cmd)
  else:
    print("Found clover reports at", base_path)

def main(argv):
  global base_path
  base_path = "./target/site/clover/"
  generate_report_if_not_exists()
  try:
    found_files = find_clover_reports()
    generate_report(found_files)
  except Exception as e:
    print(e)
    sys.exit()

if __name__ == "__main__":
  main(sys.argv)
