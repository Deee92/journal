# [Mock objects for testing java systems - Why and how developers use them, and how they evolve](https://link.springer.com/article/10.1007%2Fs10664-018-9663-0#Sec21)

[MockExtractor](https://github.com/ishepard/MockExtractor)

- Extension of [To Mock or Not to Mock? An Empirical Study on Mocking Practices](https://ieeexplore.ieee.org/abstract/document/7962389)
- Testing software artifacts with many dependencies, 2 possibilities: use concrete instances; use mocks to simulate expected behaviour
- Mock objects widely used in open source and commerical/proprietary projects - why and how practitioners use them not scientifically studied
- Impact of these decisions on coupling and software evolution
- **This study**: three open-source projects (Sonarqube, Spring, VRaptor) + 1 industrial system (Alura, co-founded by 2nd author), manual analysis of 2k+ mock objects, interview developers, survey 105 developers + leading Mockito developer, identification of rationales, practices, challenges + evolution of mock objects in test code over time + coupling between test and prod code
- **Findings**: usage of mocks depends on responsibility and architectural concern of class, developer mock dependencies that make testing harder (eg infra) - db, web services, avoid mocking domain concepts/rules of system unless they are too complex; Challenges: maintenance of mock and original class behaviour, increase in coupling between test and prod code (**mocks are tightly coupled to the prod class they mock); mocks often introduced in the first version of test class and not removed but change often, excessive mocking can hide design problems, mocking hard is legacy systems

## Introduction and Background
- SUT tested in isolation (unit) or along with all its dependencies (integration)
- integration - realism, test reflects prod behaviour, but dependencies slow test execution, are costly to set up, require testers to have full control over them
- unit + mocking: focus, expected interactions with dependencies simulated, testing specific behaviour, inefficiencies mitigated
- mocking frameworks: Mockito, EasyMock, JMock (Java) => APIs for creating mocks, setting return values of their methods, checking interactions between SUT and mocks
- Impact, evolution, challenges of using mocks helpful for practitioners, tool makers (e.g., strict, lenient mocks), researchers working on automated test generation (how to simulate a dependency, which classes to mock)
- Mock objects typically have the same interface (methods) as the real dependency => client code works both cases
- Deciding whether or not to mock a class is not trivial, depends on the context

## Research Methodology
- Two-fold study: why and how developers use mocks, how mock objects in test suite are introduced and how they evolve over time
- Study subjects: 4 OSS projects + 1 industrial project
- Research questions:
  1. which dependencies do developers mock in their tests, how often? how: manual analysis of source code
  2. why do developers decide to (not) mock specific dependencies? how: explanations for RQ1, developer interviews and surveys
  3. main challenges experienced with testing using mocks; how: interviews, surveys
  4. when are mocks introduced in test code?
  5. how do mocks evolve over time?
- Sample selection: projects routinely using mocks, implemented with Mockito; Spring framework infra support for Java developers, Sonarqube: quality management tool, VRaptor: MVC framework, Alura: e-learning system
- Data collection: MockExtractor detects all test classes (name ends with `Test(s)`), extract all dependencies in test class (class under test itself, required dependencies, utility classes like lists and helpers), each dependency marked as `mocked` or `not mocked` (all dependencies that are not mocked) based on:
  - Two ways to mock with Mockito: `@Mock` annotation when declaring class field, or calling `Mockito.mock()` inside test method
- Manual analysis: Random sample of extracted mocked and not-mocked dependencies in each project analysed (total 2178), architectural concern defined by analyzing source code of class => no categories defined up-front => 116 categories found => then merged
- Categorization: card sorting; 116 initial categories merged into 7 that define the concerns of classes => **RQ1**
- Interviews: Results of RQ1 used as input for RQ2; semi-structured interviews with technical leaders of project to understand why developers (not) mock some dependencies (categories), advantages, disadvantages, exceptions (_reading note: nice, detailed interview structure_); main themes identified using card sorting
- Survey: 4 parts (first three closed-ended, 5-point Likert scale): experience with software development and mocking, how often they use mocks for each category found, how often they use mock classes in specific cases (complex or highly-coupled classes), challenges with mocking (open-ended, optional); 105 responses; languages: Java, JavaScript, C#; frameworks: Mockito, Moq, Powermock (bytecode manipulation to mock final classes or static methods)
- Data collection, analysis: for RQ4, RQ5, info about test classes that use mocks, manual analysis to understand how and why mocking code changes
  - data extraction: when mocks are introduced in test classes; how mocking code changes over time: static analysis tool to mine history of the 4 systems
  - check if test class imports Mockito dependencies;
  - Mock introduction:
    1. if test class has mocks and is new (git addition), mocks were introduced from the start
    2. if test class does not have mocks, but did previously, mocks were removed from it
    3. if test class did not have mocks before a change, mocks were introduced later in the lifespan
  - Mock evolution: check if developers modify code (Mockito's most commonly-used APIs/methods) involving a mock
    1. check the type of change - addition/deletion/modification
    2. get list of mockito APIs involved in line with regex
    3. update number of changes
- Manual analysis: manual analysis of changes found - 100 random samples for each project - previous and modified versions of code, inspect commit to see reason behind change

## Results
1. RQ1: which dependencies do developers mock in tests? 
  - domain object (no clear trend): business rules of system, not depending on external resources, eg., entities, services, util classes
  - **db**: classes interacting with external db (DAOs, or external libraries themselves like Java SQL, Hibernate, EL, JDBC)
  - native java libraries (almost never mocked): Java I/O, Java Util (Date, Calendar)
  - **web service**: some HTTP action
  - external dependency: other libraries/classes using libraries external to current project, eg., Jetty or Ruby runtimes, GSON, email libraries, ...
  - test support (almost never mocked): classes supporting testing itself, fake domain objects, test data builders, web services for tests
  - unresolved: eg., classes belonging to a sub-module for which source code was unavailable
2. why do developers (not) mock certain dependencies?
  - **mocks used when concrete implementation is not simple**: highly coupled, complex to set up, slow, depend on external resources (eg., in-memory list faster easier than db setup); if input and output to a class can be controlled easily, it makes to instantiate it directly and not use a mock
  - **mocks not used when test focus is integration**: eg., if the test has to check integration with an external dependency (db), real interaction preferred; if A depends on B, and B interacts with external dependency, testing focus is A and B can be mocked.
  - **interfaces are mocked rather than specific implementations**: interfaces can have several implementations, mocks do not have to rely on any single one (eg., an interface that represents the side effect of sending an email or making an HTTP request)
  - **domain objects usually not mocked**: POJO don't always deal with external dependencies, are easy to instantiate and set up. May be mocked if it is highly coupled or complex to set up.
  - **native java objects and libraries usually not mocked**: String, List, ... easy to instantiate with required values, besides some may be final (String) so they can't be mocked; these provided libraries can be trusted in spite of being external, no need for mocking; Exception Java I/O - file handling can be complex
  - **db, web services, external dependencies are slow and complex to set up, good candidates for mocking**: eg., CDI (Contexts and dependency injection API), serialization libraries
3. main challenges with mocking: 
  - **dealing with coupling**: mocking increases coupling b/w test and prod code, mocking challenging for coupled prod classes
  - **legacy systems**: testing single legacy unit may need too much mocking
  - **non-testable/hard-to-test classes**: static methods in Java not mockable by default, ...
  - **mocks and good quality code**: mocks may reduce test readability and be difficult to maintain, excessive use of mocks is bad, prod code structure should be well-defined
  - **unstable dependencies**: mock has to be compatible with the real class, if latter changes often, mock becomes unstable
4. when are mocks introduced in test code? vast majority introduced during inception of class, developers tend to not refactor test cases to introduce mocks or delete them, mocks mostly used for new tests; usually not removed during the whole lifetime of test class, if removed, they are replaced with the real implementation of class.
5. mock evolution over time: `verify()`, `when()`, `mock()`, `thenReturn()` most used Mockito APIs; lines about mocks change often, reasons: test refactoring, changes to mocked prod class, changes to internal implementation of mocked class;

## Discussion
TODO

## Conclusion
Mocking is common testing practice, this paper analyzes how and why developers use mock objects; 4 projects, three developers interviewed, 105 developers surveyed, one Mockito developer interviewed. Developers tend to mock dependencies that make testing difficult, and not classes they can fully control. Technical challenges: unstable dependencies, coupling between mock and prod class, legacy systems, hard-to-test classes. Mocks generally introduced during inception of test classes, tend to stay for entire lifetime; Change as frequently as prod class they mock and changes to test code (refactoring) that use them.

