# [GenUTest: a unit test and mock aspect generation tool](https://link.springer.com/article/10.1007/s10009-009-0115-4)

- Automatic generation of **JUnit** tests + mock aspects (mock objects) **for systems that do not have tests**
- Unit tests detect regressions (in this paper, unit = class, CUT depends on other classes => need mocks)
- Mock objects (using **EasyMock**) allow CUT testing in isolation
- GenUTest = prototype tool which captures and logs interobject interactions occurring **during the execution of Java programs**
- Uses the aspect-oriented language AspectJ
- **inter-object interactions** = interactions between all objects in the system, sequences of method invocations that occur on an object
  - events supported: object instantiation, regular and static method-calls, read/write access of regular and static class fields
- GenUTest applied to several open source projects such as NanoXML and JODE
- Future work: improve coverage

### Introduction
- endo-testing: testing with mocks
- On mocks:
  - "_Mock objects are used to simulate or mock the behavior of a real unit. Mock objects respond to method-calls in the same manner as the real units would have responded. However, mock objects do not perform any action and immediately return to the caller._"
- On effectiveness of generated test suite:
  - "_The comprehensiveness of the generated unit tests depends on the software execution. Software executions covering a high percentage of functional requirements are likely to obtain high code coverage and in turn generate unit tests with similar code coverage. Such executions can be planned by the developers with the assistance of the quality assurance personnel, who are responsible for creating test scenarios that exercise the functional requirements of the software and ensure their correctness._"
- Three phases: capture (achieved through instrumentation, AspectJ), generation, test
- Capture phase: capture inter-object interactions and method sequences, use XStream:
  - "_Capturing an event involves recording its signature and the target object of the call. Returned values and thrown exceptions are recorded as well. The type of the arguments and the return value can be one of the following: primitive, object, or array_" 

### Recap of test input generation strategies (mentioned in RW)
- random - infer values from parameter and return types
- symbolic execution - visit branches, solve constraints, obtain values
- capture/record and replay - record executions, verify invariants, exceptions thrown or values observed in test assertions
  - test suite execution 
  - **real execution**
