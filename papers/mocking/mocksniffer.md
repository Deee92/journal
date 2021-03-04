## [MockSniffer: Characterizing and Recommending Mocking Decisions for Unit Tests](https://dl.acm.org/doi/10.1145/3324884.3416539)

- [Dataset](https://doi.org/10.5281/zenodo.3783869)
- Mocking = replacing actual dependencies with simple implementations; used in unit testing to
  - ease test effort
  - reduce test flakiness
  - increase test coverage
- Decision to mock not straight-forward ("which dependencies to mock?"); no clear criteria to determine which dependencies should be mocked
  - under-mocking: inability to isolate CUT from dependencies
  - Over-mocking: maintenance of all mocks
- Mocking decisions are known to evolve with time
- This study: automated mocking recommendations (novel)
  - 10,846 test scripts in 4 OSS
  - mocked dependencies characterized
  - MockSniffer automatically identifies and recommends mocks for unit tests
  - Requires CUT and its dependencies as input
  - ML techniques to make mocking recommendations, considers multiple factors
  - MockSniffer evaluated on 10 OSS, outperforms three baseline approaches

### Introduction
- CUT is coupled with other classes in program or its referenced libraries
- These classes are dependencies of the CUT and participate in its unit tests
- The decision to mock is not trivial, this decision also evolves with time
  - previously mocked dependencies become unmocked
  - new mocks introduced in existing tests
- Need to consider multiple factors when mocking
- Mocking is context-aware, depends on usage scenario, dependency A may be mocked in one test and not in the other
- Under-mocking, over-mocking
- Dependencies and their interactions with the CUTs (context-aware)
- Empirical study to identify characteristics that can be automatically extracted via code analysis, used to recommend mocks
- 10 factors found at the code level that influence mocking decision, but not individually
- MockSniffer takes CUT and dependencies as input and outputs a recommended mocking decision for each dependency
- Combines factors holistically using ML techniques with features from empirical study
- MockSniffer evaluated under two application scenarios:
  - mature projects: train MockSniffer with data extracted from historical releases to make cross-version mocking recommendations
  - new projects: train MockSniffer with data extracted from other projects to make cross-project mocking recommendations

### Background
- Verify invocations or stub them
- Mockito, popular framework
- Or create mock (dummy) classes that extend the dependency in question
- Mocking decisions are not binary, developers make them according to context, existing studies do not reflect this

### Data collection
- CUTs, their dependencies, developers' mocking decisions collected from OSS
- tuple: `<Test case, CUT, Dependency, Label >`; Label (L) is mocked or unmocked (since L can vary for the same D)
- 4 actively maintained open-source projects, all use Mockito or developer-defined mock classes
- Dynamic analysis to identify mocked dependencies, instead of static, as is used by other tools
- For each test case, find the CUT
- All non-CUT dependencies created during test execution and passed to CUT directly or indirectly are considered as test dependencies
  - passed via method calls, so these method calls are instrumented
  - exact reference type for each, and formal type parameters logged
- Mockito (`Foo$MockitoMock$XXX`, XXX is a hash code), EasyMock define special names for mocked objects
- For developer defined mocks, dependencies are considered mocked if they are instances of classes defined in test script, also extend production class 
  - can miss several developer-defined mocks
- This info is used to determine the value of L in the tuple
- 354k data entries from the four projects, from running 50k tests

### Empirical study
- Derive a set of rules to capture characteristics of mocked objects via analyzing their code
- Manual inspection of a small subset (100 data entries) of dataset to devise code-level characteristics into rules
  - random sample of 25 from each project
  - data flow, control-flow, API usage, of mocked dependencies, interactions with CUTs
- Automated validation of these rules with a large-scale (entire) dataset
  - mock ratio: proportion of entries labelled as mocked
- Results: 5 observations, 10 rules
- **Classes related to environment (network, database, disk, APIs of online services) or concurrency are often mocked**
- **Complicated classes (large number of fields or referenced classes or dependencies) are often mocked**
- **Non-concrete types (abstract classes or interfaces) are usually mocked**
- **Dependencies affecting runtime control flows of methods (stubbing so that different branches or exceptions are exercised by tests) in CUTs are often mocked**
- **Dependencies capturing internal behaviors of CUTs are often mocked (verifying invocations, conditionally for example)**

### MockSniffer
- Training ML models with the mocking practices extracted from existing test cases
- Feature engineering: 16 features used in ML model, 4 categories
  - contextual information: features that capture interactions between CUT and dependency by matching patterns
  - API usage: of dependency (reflects behavior)
  - complexity: number of fields and dependencies to other classes
  - class meta-properties: if dependency is abstract or an interface, if it belongs to production code or is provided by JDK, etc
- Different ML classification models trained. Gradient boosting performs best (nearly 75% accuracy wrt developer decision to mock/not mock on the 4 projects).

### Evaluation
- RQ1: effectiveness of MockSniffer
  - evaluation on 4 + 6 more projects
  - outperforms existing strategies (three selected baselines)
RQ2: effectiveness of a single feature
  - combination of context-aware and APU usage features
RQ3: potential application scenarios of MockSniffer
  - Cross-version prediction
  - Cross-project prediction
  
### Conclusion
- Empirical study on 4 large OSS, ten code level characteristics of mocked dependencies, 
- MockSniffer for automated recommendation on mocking decisions, uses ML for context-aware mocking decisions based on existing mocking practices 
- Outperforms generic mocking strategies adopted by existing studies

### References
- Empirical studies on mocking
- Automatic test generation with mocking

