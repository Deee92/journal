## [Software testing](https://en.wikipedia.org/wiki/Software_testing)

- Ensuring quality
- Objective for development (eg., with TDD)
- Executing a program with the intent of finding bugs (errors/defects); other use cases:
  - to test that requirements are met
  - to correct response/outputs for inputs
  - to ensure that response time is acceptable
  - to ensure usability
  - to ensure that SUT can be installed and executed
  - to ensure that SUT achieves desired result
- Testing is iterative: fixing one bug can uncover other bugs/create new ones
- Debugging: isolating and correcting bugs found during testing, part of white-box/unit testing
  - _Myers_ distinguished testing from debugging, 1979
- SDLC decides when testing is done in the project lifecycle
- Testing cannot identify all defects in software, is never exhaustive
  - Impossible to test against all environments and input combinations
  - Tests designed to identify minimum number of tests for greater coverage with fewer tests
- Program state compared with test oracles: expected correct behaviour
  - oracles may include specifications, contracts, intended or expected outcomes, standards, ...
- Testing does not mean the absence of errors - only ensures that software is tested against certain behaviours
- Programmer mistake or **error** -> results in a **defect**, **bug**, or **fault** -> which when executed becomes a **failure**
- Dead code: never exercised, defects go undetected
- Non-functional requirements: usability, scalability, performance, reliability, testability, maintainability, compatibility, security => **subjective**

### Testing approaches
1. static - reviews, walkthroughs, inspections (no executions), *verification*
2. **dynamic** - executing program with certain test cases, examples: unit testing, using stubs, drivers, debuggers, *validation*
3. passive - verifying behaviour without interacting with product, mining patterns in logs and traces to understand behaviour and make decisions, *offline runtime verification, and log analysis*
4. exploratory - simultaneous learning, test design, test execution; onus on the "personal freedom" and "responsibility" of tester
5. "box" approach: white and black (or hybrid grey) box testing => POV of tester when designing test cases
  - **white-box**: aka _clear, glass, transparent, structural_, verifies internal structure/working of program, not the functionality exposed to end user; source code needed; tester uses inputs that exercise paths through the source code to determine appropriate output; applied at _unit, integration, or system_ levels; Techniques include **API testing, code (function, statement, decision) coverage, fault injection, mutation testing (and pseudo-tested methods), static program analysis (formal methods/verification such as symbolic executions)**
  - black-box: aka functional, examining functionality without knowledge of internal implementation, no source code. Testers know what system does, now how it is done. Can be applied at _unit, integration, or system_ levels; Techniques include **equivalence partitioning, BVA, all-pairs testing, state transition tables, decision tables, fuzzing, model-based testing, use case testing, exploratory testing, specification-based (requirement- or design-based) testing**
  - visual or GUI testing: presenting data from point of failure to allow developers to find info for debugging; usually involves capturing test process in a video format; Techniques: **ad-hoc, exploratory**
  - grey-box: knowledge of internal data structures and algorithms while designing tests; tester has source code and executable

### Testing levels
1. unit: verifying functionality of a specific section of code (usually at method or class level); written by developers for white-box testing to check corner cases and branches; done during development phase; increases quality and efficiency of overall development process
2. integration: verifying interfaces between integrated components/modules; testing progressively larger groups of tested software components corresponding to architectural design; usually involve a lot of code
3. system: testing a completely integrated system to verify system meets requirements
4. acceptance: operational, end-user, contractual/regulatory, alpha, beta

### Testing types, techniques, tactics
- installation
- compatibility
- smoke (minimal attempts to operate software to find basic problems that can prevent system from working at all, e.g., build verification tests) and sanity (whether reasonable to proceed with further testing)
- **regression**: finding defects after a major code change, uncovering software regressions, previously working components that stop working correctly/as intended, unintended consequence when newly developed or changed clashes with existing components; effort-intensive; techniques include rerunning previous test cases; having strong assertions on existing behaviour, generating and adding new assertions to existing test cases; process called **automatic test amplification**.
- acceptance: operational (e.g., smoke), end-user (UAT)
- alpha: simulated/actual operational testing usually done in-house, common for off-the-shelf software for internal acceptance testing before software goes to beta testing
- beta: done after alpha, external UAT, beta versions of software released to limited audience outside programming team ("beta testers"). Main component is the feedback which can be used to fix faults and debug final release. indefinite beta release => perpetual beta.
- functional: verifying a specific action or function of code, e.g., "can the user do this?", "does this feature work?"
- non-functional: global aspects of the software, e.g., scalability (wrt users etc), performance, behaviour under constraints, security; determining breaking point before unstable execution, reflect quality of product
- continuous: executing automated tests as part of the software delivery pipeline for immediate feedback; validating functional and non-functional requirements
- destructive (**chaos engineering or fault injection**): causing software/sub-system to fail; verifying that software functions properly even when it receives invalid or unexpected inputs, establish robustness, verify error-management and exception-handling routines, recovery testing; also related: **fuzzing**
- performance: determines how system/sub-system performs under workload (in terms of stability, responsiveness); scalability, reliability, resource usage. Load (scalability) testing - large quantities of data or users; endurance testing; volume testing (data); stress testing (rare workloads); stability testing; real-time testing (for systems with strict timing constraints)
- usability: check if UI is easy to use, navigate, intuitive, usually not automated, done by actual human users manually, monitored by skilled UI designers
- accessibility: compliance with accessibility standards
- security: prevent intrusion, attacks, hacking, done to ensure (confidential user) data is protected against unauthorized access and misuse 
- i18n, localization: validating that system can be used with different languages, geographic regions (also currencies and time zones)
- development testing: software development process involving many defect detection and prevention strategies to reduce risks, time, costs; static code analysis, data flow analysis, peer reviews, unit testing, code coverage analysis, traceability.
- A/B: running a controlled experiment to determine if a proposed change is more effective than current approach, customers routed to ver A (_control_) or ver B (_treatment_) of a feature, determine which version is better at achieving desired outcome
- concurrent: behaviour of concurrent systems, to understand deadlocks, race conditions, shared memory/resource handling
- conformance/type: product performs according to specified standards, compilers, PDF readers, ...
- output comparison/snapshot/golden master: expected display outputs through UI or data comparison, needs human evaluation

### Testing process
Example: test planning, development, reporting, retesting, regression, closure
- Waterfall: traditional (testing after functionality is developed), or alongside each phase (V-shaped)
- Agile or XP: TDD, writing unit tests first, test -> code -> refactor, support CI and reduce defect rates

### Automated testing
Frameworks to write tests in, CI software runs them automatically every time code is checked into VCS. Useful for regression. Needs test suite and test scripts to be useful. Benchmarking (runtime performance comparisons), profiling (performance hot spots), coverage, hypervisors, GUI testing, dynamic program animation with breakpoints, debugging

### Measurement in software testing
correctness, completeness, security, and (ISO/EIC 9126) capability, reliability, efficiency, portability, maintainability, compatibility, usability; many software metrics to determine state and adequacy of testing; Five classes of testability of a system.

### Testing artifacts
- Test plan/strategy: approach, objectives, scope, processes, procedures
- Traceability matrix: table that correlates requirements and design documents to test documents, useful when planning regression tests when finding components that might be affected
- Test case: a series of steps/actions for setup, assertion against an oracle (comparison between an expected and actual outcome), teardown
- Test script: code to replicate user actions; a test case is a baseline to create test scripts
- Test suite: collection of test cases and their description + pre-requisite states and steps
- Test fixture/data: sets of data to test a particular feature; can be documented and shared with client/user
- Test harness: software, tools, input and output data, configurations 
- Test run: report with test results

### Related
- [Verification and validation](https://en.wikipedia.org/wiki/Software_verification_and_validation)
- [QA](https://en.wikipedia.org/wiki/Software_quality_assurance)

