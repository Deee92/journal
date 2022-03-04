### Definitions

- **methods**: public methods in the project (non-empty, non-deprecated, etc)
- **methods with nested invocations**: methods that have at least one invocation on a field or parameter
- **instrumented methods**: number of (void or non-void public) instrumented outer methods with nested invocations that can be mocked with Mockito
- **instrumented nested methods**: number of nested invocations that are intrumented
- **effective targets**: number of instrumented methods that are invoked with the workload
- **effective nested targets**: number of instrumented nested methods that are invoked within effective targets
- **generated tests with mocks**: number of tests with mocks, generated for effective nested targets
- **passing**: generated tests with mocks that pass
- **failing**: generated tests with mocks that do not pass

### Data

\#  | case study | methods | methods with nested invocations | instrumented targets | instrumented nested methods | effective targets | effective nested targets | generated tests with mocks | passing | failing | comments
--- | ---------- | ------- | ------------------------------- | -------------------- | --------------------------- | ----------------- | ------------------------ | --------------------------- | ------- | ------- | --------
1   | PDFBox     | 6169    | 3614 / 6169 (58.6%)             | 173                  | 240                         | 55 / 173          | 34 / 240                 |   184                        | 73 / 184 (39.7%)  | 111 / 184 (60.3%) | original workload


### TODO:
- add pre-defined examples to workload for PDFBox (`java -javaagent:/home/dee/dev/glowroot/glowroot.jar -cp target/pdfbox-examples-2.0.24-jar-with-dependencies.jar org.apache.pdfbox.examples.util.PrintTextColors target/SimpleForm.pdf`)
