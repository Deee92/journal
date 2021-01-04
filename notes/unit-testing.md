## [Unit testing](https://en.wikipedia.org/wiki/Unit_testing)

- Software testing method to determine if individual "units" of source code (modules/components) are fit to use
  - Unit meets design goals and behaves as intended
- Typically automated, written and run by developers
- Goal: isolate and test each unit to verify its correctness, provides strict written contract that the unit satisfies
- The unit is commonly a class or a method
- Each test case executed independently
- Test substitutes/doubles such as method stubs, mock objects, fakes, test harnesses used to assist testing a unit in isolation
- Oracles used to specify correct behaviour
- Test frameworks produce logs and test summary/report after test execution
- Parameterized tests: one test with different test inputs (as parameters), code de-duplication, more cases
  - Supported by TestNG, JUnit, XUnit (for .NET)

### Advantages
- Allows identification of possible error, input, and output conditions during development
- Encourages better, more testable code structure
- Easier fault detection and isolation
- Serves as regression tests while refactoring
- Serves as documentation (understanding of the unit's interface or API)
- Potential problems caught early in development cycle
- TDD, used in agile and XP
- Allows bottom-up testing - unit > integration > system

### Disadvantages
- Testing never exhaustive, not all execution paths are evaluatated
- Writing useful, relevant tests is not a trivial activity, oracles must be defined (oracle problem) 
- Only single units functionally-tested, not how units interact with each other, neither are non-functional aspects tested
  - Should be used alongside other testing techniques
- Not all problems can be easily tested, such as non-deterministic or concurrent ones
- Test code can itself be buggy
- Mocking often fails to capture complexity of external units such as databases
- Testing efforts must be consistent

