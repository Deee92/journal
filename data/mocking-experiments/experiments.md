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
1   | PDFBox     | 3610    | 103 / 3610       | 22 / 103          | 254             | wip     | wip     | (original workload)

### TODO:
- add stubs to tests that verify sequence of nested method invocations
- add pre-defined examples to workload for PDFBox
