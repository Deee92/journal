import glob
import json
import re
import sys

def merge_dicts(toMerge, outputDict):
  for key, value in toMerge.items():
    if (outputDict.get(key)) is None:
      outputDict[key] = value
    else:
      outputDict.get(key).extend(value)
  return outputDict

def sanitize_file_name(base_path, f):
  f = f.replace(base_path, "")
  f = f.replace(".js", "")
  f = f.replace("/", ".")
  return f

def exclude_test_classes(base_path):
  test_files = []
  base_path_for_test_sources = base_path.replace("/target/site/clover/",
                                                 "/target/clover/src-test-instrumented/")
  path = base_path_for_test_sources + "**/"
  test_classes = glob.glob(path + "*.java", recursive=True)
  for c in test_classes:
    c = c.replace(base_path_for_test_sources, base_path)
    c = c.replace(".java", ".js")
    test_files.append(c)
  return test_files

def find_clover_reports(base_path):
  path = base_path + "**/"
  test_files = exclude_test_classes(base_path)
  js_files = glob.glob(path + "*.js", recursive=True)
  js_files_for_source = []
  for f in js_files:
    if re.search("\/[A-Z].*.js", f) and f not in test_files:
      # if re.search("\/[A-Z].*.js", f):
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
      result[name + "#" + str(sl["sl"])] = [test_name]
    merged_result = merge_dicts(result, merged_result)
  return merged_result

def extract_json_from_file(name, file):
  search_string = "clover.testTargets = "
  with open(file) as f:
    for line in f:
      if search_string in line:
        return parse_extracted_json(name, line.replace(search_string, ""))

def generate_report(base_path, files):
  report = {}
  for file in files:
    sanitized_name = sanitize_file_name(base_path, file)
    result = extract_json_from_file(sanitized_name, file)
    report = merge_dicts(result, report)
  return report

def handle_multiple_modules():
  modules = []
  paths = glob.glob("./**/target/clover/src-test-instrumented", recursive=True)
  if (len(paths) == 0):
    print("USAGE: Generate reports first with `mvn clean clover:setup test clover:aggregate clover:clover`")
    sys.exit()
  for p in paths:
    modules.append(p.replace("/target/clover/src-test-instrumented", "/target/site/clover/"))
  return modules

def main():
  global base_paths
  global aggregate_report
  aggregate_report = {}
  try:
    base_paths = handle_multiple_modules()
    for base_path in base_paths:
      found_files = find_clover_reports(base_path)
      report = generate_report(base_path, found_files)
      aggregate_report = merge_dicts(report, aggregate_report)
    report_path = "./line2tests.csv"
    print("Generating line2tests report:", report_path)
    with open(report_path, 'w') as f:
      f.write("class#line,tests\n")
      for key in aggregate_report.keys():
        f.write("%s,\"%s\"\n" % (key, set(aggregate_report[key])))

  except Exception as e:
    print(e)
    sys.exit()

if __name__ == "__main__":
  main()
