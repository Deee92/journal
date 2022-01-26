### Definitions

- **targets**: non-static, non-void, public methods that can be instrumented (they meet some additional criteria - abstract, synchronized, deprecated, empty, ...)
- **mockable targets**: targets that have nested method invocations that may be mocked
- **effective targets**: mockable targets that are invoked with the workload
- **generated tests**: number of tests generated with collected object profiles of effective target methods (not including tests with mocks)
- **passing**: number of generated tests that pass
- **failing**: number of generated tests that do not pass

### Data

\#  | case study | targets | mockable targets | effective targets | generated tests | passing | failing | comments
--- | ---------- | ------- | ---------------- | ----------------- | --------------- | ------- | ------- | -------- 
1   | PDFBox     | 3610    | 95 / 3610        | 20 / 95           | wip             | wip     | wip     | (original workload)

### TODO:
- add stubs to tests that verify sequence of nested method invocations
- add pre-defined examples to workload for PDFBox (`java -javaagent:/home/dee/dev/glowroot/glowroot.jar -cp target/pdfbox-examples-2.0.24-jar-with-dependencies.jar org.apache.pdfbox.examples.util.PrintTextColors target/SimpleForm.pdf`)
