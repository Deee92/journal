## [Software bug](https://en.wikipedia.org/wiki/Software_bug)

- an error/flaw/fault in a computer program/system that makes it produce incorrect/unexpected/unintended result/behaviour
- debugging: finding and fixing bugs
- bugs commonly arise from mistakes and errors made in program design or implementation (source code) or its environment (components, OS used by program); can also arise from compilers producing incorrect code
- bugs can trigger errors that may have ripple effects; or cause program to crash/freeze computer; security bugs can enable unauthorized access by malicious users
- serious software bugs can also cause disasters; Therac-25 radiation therapy, ESA's Ariane 5 rocket, Mull of Kintyre Chinook heli-crash
- bug comes from _bugge_, used in words for monsters such as _bugbear_ or _bugaboo_; used as engineering jargon since 1870s
- Use predates computers and programming, used by Thomas Edison, Isaac Asimov, ...
- Grace Hopper used it for a malfunction in an early electromechanical computer, 1947: moth trapped in a relay, carefully removed and taped to log book (now housed in AMNH), was actuallly found and coined by others as "first actual case of bug being found", Hopper recounted and popularized the story
- 1843 Ada Lovelace's notes on the analytical engine: possibility of errors in program cards

### Prevention
- Typographical errors: typographical and logic errors made by programmer, can be prevented while compilation and by using programming style and defensive programming to make bugs less likely
- Development methodologies: SE techniques to prevent defects, formal specifications (expensive for any complex program due to combinatorial explosion and indeterminancy); unit testing; TDD; agile software development; open-source development - _given enough eyeballs, all bugs are shallow_ - but complex vulnerabilities and defects may go undetected due to lack of documentation
- Programming language support: static type systems, restricted namespaces, modular programming, e.g., Java not allowing pointer arithmetic
- Code analysis: tools inspecting program beyond compiler's capabilities to spot potential problems (may not always work, as per halting problem), but programming mistakes are often simple
- Instrumentation: tools to monitor performance of running program, find bottlenecks, logging

### Testing
Software testers find bugs, write code, sometimes get metrics

### Debugging
- Finding and fixing bugs, major part of computer programming; first step is usually to reproduce bug
- Debuggers are tools that can help locate bugs by executing code line-by-line, watching variable values, other features to observe program behaviour
- Alternatively, code/logging added to program to trace program execution/show values
- Bugs in one section can cause a failure in a different section - difficult to track
- A bug may also not be an isolated flaw, but due to a combination of errors and planning - logic errors might need some sections to be refactored/rewritten
- some bugs can be caused by inputs that are hard for programmer to reproduce; some bugs do not surface in the testing environment, called "heisenbugs"
- bugs may not arise due to implementation; faulty documentation/hardware can lead to problematic use of system

### Benchmarks of bugs
- Siemens benchmark
- ManyBugs - 185 C bugs in 9 open-source projects
- [Defects4J](https://github.com/rjust/defects4j) - 835 (as in v2.0.0) Java bugs from 17 open-source projects, has corresponding patches, different patch types (M. Ernst)
- [BEARS](https://github.com/bears-bugs/bears-benchmark) - CI build failures focusing on test failures, monitoring builds from open-source projects on Travis CI

### Bug management
- Process of documenting, categorizing, assigning, reproducing, correcting a bug, and releasing corrected code
- Bug and issue tracking systems track proposed changes, bugs, enhancement requests, entire releases
  - items called defects, tickets, issues, or in agile terminology epics and stories
  - other info: version number, severity, priority, type of issue (feature request/bug)
- Severity: impact of bug on system operation
- Priority: how bug ranks in list of planned changes (critical, high, low, deferred)
- Software releases: software often released with known, low-priority bugs; _patches_: releases dedicated to fixing high priority bugs, including corrected modules; a _maintenance release_ mostly has bug fixes; most releases have a combination of new features and multiple bug fixes; releases with major feature additions and changes are _major releases_, are often named

### Types
- Conceptual: resulting software may perform according to developer understanding, but not what is really needed; bugs can arise from oversights or misunderstandings made during design. coding, documentation, or even execution (e.g., race condition) - latter more difficult to detect and anticipate, may not occur during every execution - hard to reproduce, non-deterministic
 - Arithmetic
 - Logic
 - Syntax: usually caught for compiled languages by compilers
 - Resource: NPE, unitialized variables, ...
 - Multi-threading: deadlocks, race conditions, concurrency errors in critical sections
 - Interfacing: incorrect API usage, protocol implementations, assumptions, annotations, incompatible systems, ...
 - Teamworking: unpropagated updates (solvable with DRY principle), outdated/incorrect comments and documentation

