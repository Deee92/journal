[An Empirical Study on the Usage of Mocking Frameworks in Software Testing](https://ieeexplore.ieee.org/abstract/document/6958396?casa_token=wu5Q4CnTydAAAAAA:8LAS2BXUvNeJb2SNkUtoHnJuKlUGZ1Bq4lizSuppqRictHqsl-d8ymu5dCa_YJeAdiOLaQTBsg)

- Excluding dependencies during unit testing - mock objects
- Reasons: unstable, high cost (time, commercial third-party services), interference of different sources of bugs, unavailability of dependencies, ...
- Four most popular mocking frameworks (Java): Mockito, EasyMock, JMock, JMockit
- Few academic studies despite high usage
- **This study**: above mocking frameworks in 5k+ OSS Java libraries
- **Findings**: these frameworks used in 23% of libraries with test code; mocks created for only some dependencies, more source code classes mocked than library classes.

## Background
1. Mocking objects: used to simulate software dependencies, accelerate testing process, limit testing scope (for more focus) by avoiding the invcation of potential bugs related to dependencies; Typically have the same interface as the object that they mimic, client unaffected; Example: mocking the email server when testing an email client.
2. Mocking frameworks: Writing mocks is not trivial, frameworks developed to generate mock objects automatically; Steps: 1) Create empty mock object, 2) specify number of invocations for the object to check, both on the order of invocations, and the correctness of the arguments, 3) run the component under test as usual but with created mock object; Outcome: passing or failing test whether expected interactions occurred using mock object. Mocking frameworks exist for most major languages.

## Design
- Research questions:
  1. How popular are mocking frameworks in open-source Java software projects? Do developers mock most or some dependencies?
  2. Which features of the mocking frameworks are most frequently used in the testing of these projects?
  3. Which dependencies do developers tend to mock?
- Subjects: Randomly downloaded 5k+ Java projects from GitHub (note: not very systematic), statistics like LOC, number of commits and contributors, Java test and source files 
- Process: Extract code relevant to mocking frameworks (PowerMock not considered) - API invocations of Mockito and EasyMock frameworks

## Empirical study results
- 2046/5000 projects have at least one test class, 459/2046 use at least one mocking framework (23%): these projects tend to be large in size
- Most used was Mockito, followed by EasyMock, JMock, JMockit; some used multiple frameworks
- Not all test classes use mocking => not all dependencies are being mocked
- Most used API invocations (Mockito and EasyMock):
  - `Mockito.verify()`
  - `Mockito.mock()`
  - `Mockito.when()`
  - `Mockito.spy()`
  - `Mockito.times()`
  - ...
  - `EasyMock.expect`
  - `EasyMock.create`
  - `EasyMock.replay`
  - `EasyMock.verify`
  - ...
- Mocked dependencies: 39% mocked classes are from external libraries (most mocked `javax.servlet.http.HttpServletRequest`, ...); developers tend to mock source classes more

