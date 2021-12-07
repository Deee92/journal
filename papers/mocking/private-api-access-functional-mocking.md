## [Private API Access and Functional Mocking in Automated Unit Test Generation](https://ieeexplore.ieee.org/document/7927969)

- Dependencies - hard to instantiate - mocking during tests
- Encapsulation - some components inaccessible within tests - private API through reflection
- Extending EvoSuite to allow access to private API + create Mockito mocks
- Usefulness of generated tests: code coverage + bug finding
- SF110 and Defects4J
- False positives: breaking tests due to renaming of private API (methods) (non-semantic changes)

### Introduction
- Automatically generated tests serve as regression tests
- Coverage
- Mock objects generated (Mockito): what values method calls on mock objects should return
- private methods being accessed through reflection
- private method may be renamed - generated test will then fail
- mock object may become outdated - mocked behaviour may change 
- search based unit test generation

### Background
Testing private methods:
- goal of testing - improving coverage
- private methods may or may not be called by other methods
- call them directly through reflection
- method names as strings - refactoring (renaming method) will not be reflected in the test

Functional mocking:
- isolate class from its dependencies
- developers write mock classes manually or use mocking frameworks such as Mockito, PowerMock, EasyMock, ...
- Techniques: stubbing (replacement with default behavior), fakes, test doubles, ...
- Called functional mocks to distinguish from some other feature in EvoSuite called "environment mocks"

Goal: integrate private API acess and mocking into unit test generation, while addressing false positives by using reflection and mocking only when necessary

### PAFM: integrate Private API Acess and Functional Mocking into unit test generation
WIP

### References to follow up on
5, 30
