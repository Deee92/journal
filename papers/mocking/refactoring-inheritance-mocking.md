## [An Automatic Refactoring Framework for Replacing Test-Production Inheritance by Mocking Mechanism](https://dl.acm.org/doi/10.1145/3468264.3468590)

- [JMocker](https://github.com/wx930910/JMocker)
- [More data](https://sites.google.com/view/mockrefactoring/home?authuser=0)
- Inheritance-based mocking to mocks using Mockito
- Mockito: mock, verify (+ times), spy, stubs (when, doReturn, thenReturn, doAnswer, thenAnswer, ...)
- Implemented as an Eclipse plugin
- Subclass used as mocks within tests = coupling between test and prod code + maintenance issues + code complexity
- Refactoring: Identify subclasses that may automatically be refactored, refactor them into Mockito mocks in the tests
- Static analysis, no test execution, Java + Mockito

### Evaluation
- Applicability of automatic refactoring framework to 5 OSS + 4 OSS
- Impact on test behavior through mutation analysis = similar fault finding capability
- Impact on code complexity (due to refactoring out of subclases for mocking) = decrease in code complexity
- runtime performance of refactoring framework (
- User study with 6 developers

### Notable
- References
- Mockito background + technical (API)
