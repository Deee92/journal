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
- Empirical evaluation on 5 OSS to study what can and can't be feasibly refactored automatically
- Applicability of automatic refactoring framework to 4 OSS: successfully applied to 214/610 (35%) of subclasses
- Impact on test behavior through mutation analysis: similar fault finding capability pre- and post-refactoring
- Impact on code complexity (due to refactoring out of subclases for mocking): decrease in code complexity since it reduces the coupling between test and production classes
- runtime performance of refactoring framework (i.e., time it takes to identify refactoring candidates + do the actual refactoring): few minutes and few seconds, respectively
- User study with 6 developers, who rate it positively

### Notable
- References
- Mockito background + technical (API)
