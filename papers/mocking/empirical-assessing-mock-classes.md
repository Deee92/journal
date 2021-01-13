## [Assessing Mock Classes: An Empirical Study](https://ieeexplore.ieee.org/abstract/document/9240675)

- Developers rely on dependencies like web services, dbs (possibly slow, unstable, undeterministic) - these make testing harder 
- Mock objects emulate dependencies' behaviour - tests become fast, isolated, repeatable, deterministic
- Mocks can be created manually via mock classes or dynamically through mocking frameworks
  - Mocking frameworks extensively studied
  - Assessing mock classes can help in understanding how they are created and used by developers + novel practices and challenges
- This paper: first empirical study to assess mock classes, which dependencies do they emulate? how are they different from mocks made with frameworks? 
- 12 software projects, 604 mock classes, assess their content, design, usage
- **Findings**: mocks emulate domain objects, external dependencies, web services, are part of hierarchy, mostly public, 1/3 private, mostly consumed by client projects esp to support web testing
- Mock frameworks, largely used:
  - JavaScript: SinonJs, Jest
  - Java: Mockito
  - Python: unittest.mock (core library)
- Manually-written mocking classes directly consumed, no frameworks, eg., classes dedicated to mocking in Spring web framework, or classes like `MockServer`, `MockHttpConnection`, `MockServlet` in Apache Camel
- **Research Questions**
  1. Content: What is the content of mock classes? Manual categorization of 604 mock classes wrt the dependency they emulate. Finding: domain objects, external dependencies, web services
  2. Design: How are mock classes designed? Structural details of mock classes. Finding: mock classes extend other classes or implement interfaces, most are public, some private, have same number of methods as regular classes
  3. Usage: How are mock classes used by developers? Finding: mock classes largely consumed to emulate web services, usage concentrated to a few classes consumed by clients
- Insights based on findings
- Contributions: empirical analysis, mock classes content, usage, design, insights and practical implications

## Background

### Mocks and test doubles
> Test double: the broadest term available to describe any fake thing introduced in place of a real thing for the purpose of writing an automated test

Mock objects are a very common type of test double (terms almost used interchangeably). _"Mock objects replace an object that the SUT depends on with a test-specific equivalent that verifies it is being used correctly by the SUT" ( - Meszaros)_ Mock objects verify behaviour. They are configured with values that they should respond to SUT with, and method calls that are expected from SUT.

Other test doubles (see [Martin Fowler, test doubles](https://martinfowler.com/bliki/TestDouble.html) or [Mocks aren't stubs](https://martinfowler.com/articles/mocksArentStubs.html):
- stubs: 
- spies
- fake objects

In this study, mock classes identified as ones whose names include the word `mock`.

## Study design
12 popular Java projects (libraries) on GitHub. Manually identify mocks from a) mocking framework Mockito (`Mockito.mock()`); and b) manually written mock classes (name includes "_mock_", no `Mockito` import, is not a test class (name does not start or end with "_Test_"))

Most common terms in mock classes, excluding "Mock": Client, Filter, Amazon, Factory, Request, Http, Script, Mvc, Server, Service

1. RQ1: Content: categories (as introduced by [Spadini et al](https://ieeexplore.ieee.org/abstract/document/7962389)): domain object (business rules), external dependency/libraries (eg. Amazon, GitHub), web services or actions (Client Http Response, Http Resource), test support, native Java libraries, network service, database (none found). Based on class names, documentation analysis, source code inspection; **Findings** => developers tend to mock the same dependencies through mocking frameworks and manually written mock classes; Differences: db mocks created using frameworks and not manually. Network service mocks not done using mocking frameworks.

2. RQ2: Design: Inheritance and interface: whether mock classes are more likely to implement interfaces, or extend classes, or neither - whether they are part of hierarchies/are standalone. Visibility (reusability): public to be used all over the project itself, as well as by its external clients, private => local use. Number of methods compared to those in randomly selected regular classes. Size: larger (more maintenance effort) or smaller (less effort); **Findings** => extending classes usually more frequent than interface implementation, very small percentage do not do either. Majority of mock classes declared as public, then private, then package visibility (default), protected least frequent; Median three methods in both regular classes and mock classes => equivalent number of methods in both categories, similar maintenance effort.

3. RQ3: Usage: focus on client side, large scale dataset **Boa** with 2 million open-source Java systems, to see if mock classes are used in the wild => import statements with word `mock`. **Findings**: 6444 mock classes found in dataset used 147433 times => mocks are widely used. 128/604 mock classes from this study also used by external clients in this dataset; **web service mocks most common**, followed by domain object and external dependency. Least common: native Java library, test support, network service. Most consumed mock classes: `MockHttpServletRequest` and `MockHttpServletResponse` provided by Spring to facilitate web testing, the next most common one is `MockEndPoint` (external dependency) by Camel to test routes and mediation rules.

### Discussion
novelty: studies on mocks mostly focus on mocking frameworks, not manually written mock classes; empirical study with categories domain, web services, network, external, ... Structural information, external clients depend on mock classes => care must be taken during maintenance so as to avoid negative impacts.

Questions that follow: When do developers rely on mocking frameworks and when do they manually write mock classes? [R Martin](https://blog.cleancoder.com/uncle-bob/2014/05/10/WhenToMock.html): improve reuse, mock design, performance by not using reflection

