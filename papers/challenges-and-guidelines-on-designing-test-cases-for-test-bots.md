## [Challenges and guidelines on designing test cases for test bots](https://arxiv.org/abs/2004.10143)

Test bots are automated testing tools, autonomously and periodically run test cases to check that SUT meets customer requirements\
Automation decreases time required by dev team spends on testing\
Larger projects must focus on improving test bots\
Literature lacks insights on how test case design affects effectiveness of test bots\
Case-study approach to investigate these effects, identify challenges in designing tests for test bots\
Guidelines for test design schema for bots\

### Introduction
Software automation tools + test bots decrease dev time spent on testing\
Test bots can handle test coverage, flakiness, planning\
Challenges related to designing and applying test bots not studied - planning test executions, desgining test cases\
***Goal: investigate current industry practices and challenges with software testing aided by bots***\
Case study: automotive Swedish company - practitioner interviews, test artifact analyses, identify current practices, challenges, propose guidelines on test design for test bots\

### Research questions
1. main challenges when designing and executing system tests on software bots
2. extent of test design on effectiveness of test bots

### Contributions
(Usage of test bots in system testing)
- list of challenges in designing test cases for a test bot, as reported by industry practitioners
- six-term guideline to support practitioners in designing test cases when using test bots (execution time, cyclomatic complexity of test code, effect of sync-async programming on cost and maintenance of test bot)

### Methodology
- usage of a test bot for black box, E2E, system testing
- one project, Swedish autonomotive industry
- direct and indirect data collection
- thematic analysis of [interviews](https://docs.google.com/document/d/1-RzPtGJk7gSVJTjw0x9_t_IXFwUNvPlRRpTdp6fzEcI/edit), assessment of artifacts
- four participants: software architect, 2 senior software developers, 1 junior software developer
- validation of findings with interviewees

### Findings and discussion
Test bots at comapany for load testing, integration testing, system testing\
This study focusses only on system testing bots\
System testing bots perform end-to-end testing with a specific rate on different functionalities of system\
To design test cases:
- language in which system test bot written depends on whether system runs on the back-end or the front-end
- practitioners must have knowledge on corresponding programming language
- practitioners must have an overview of component architecture to understand flow between microservices

Regular workflow of test bot:
- autonomously triggered execution of test cases
- logging of test results
- detailed error logs in case of failures to make debugging easier
- interaction with practitioners by 
  * submitting result data and status to team dashboard
  * notifying correct team on slack in case of test failures with test status and details of execution

### RQ1 analysis
Challenges in designing test cases for test bots:
- designing context-aware test cases => tests may be dependent on each other, test chaining, tests should be atomic, modular, independent of each other
- monitoring, controlling changes in system state => partially-exceuted test suite can leave incomplete data models, cause NPEs later, bots should rollback any changes and invalid data states
- instrumenting system rollbacks, clean-up => if all test cases finished successfully, test bots should clean up and tear-down logs and other artifacts, restore system state
- detecting flaky tests => false-positives, failing test cases when there are no errors in functionality, tester time and effort wasted, stability of third-party systems should be considered

Test design/usage:
- positive flow
- negative flow
- modular and easy to read
- test reports
- in-house test runner framework

Frameworks:
- JUnit
- AssertJ
- Async programming
- Sync programming
- Serverless functions (pay-per-use hosting for test bots)

### RQ2 analysis
Analysis of artifacts\
Two different approaches for implementation of test bots to test the same functionality:
1. synchronous programming
2. asynchronous programming => more beneficial because tests can run in parallel so faster execution, autonomy and independence of test cases, fewer false positives, reduced cyclomatic complexity of test code

### Guidelines for designing tests for test bots
Data collected from interviews and artifacts, guidelines to mitigate challenges
1. Use async programming methods to invoke system endpoints - tests can be independent, less execution time
2. Cover test dependencies by chaining dependent tests by specific callback async functions - dependent tests will be able to wait for completion of previous test in chain
3. Create small, modular, readable tests - maintainable tests, less time in analysis and development of new tests
4. Clean-up after test execution - avoid corrupt and unnecessary test data in real prod environment
5. Use proper logging techniques to differentiate test data from real data - test activity logs different from user activity logs
6. Implement both positive and negative flow testing techniques - test inside and outside specs for thoroughness

