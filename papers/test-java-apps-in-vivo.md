### Run Java Applications and Test Them In-Vivo Meantime

https://github.com/IASI-SAKS/groucho

Test case outcome depends on state of object under test. Can't cover all possible object states exhaustively. Delegate testing to runtime and test if new/uncommon state observed. Groucho = framework for in-vivo testing of Java apps. Challenges: isolation of test session from user session, minimal performance overhead.

## Introduction
Testers select representative object states to cover equivalence classes. Defining these classes is difficult, faults may escape in-lab testing, show up in production when system being used by end-users => field failures. Dominant cause = combinatorial explosion.\
In-vivo testing = test case execution in prod to tackle combinatorial explosion, taking advantage of the large number of executions (distributed, multiple users that essentially become testers) and object states that occur in the field.\
In-vivo testing challenges:
  - isolation: sandboxing execution of test cases, end user session should not be corrupted, **test execution should have no side-effects on user session**
  - overhead: normal execution would have to be impacted/suspended for test execution, **minimal impact on end-user activities**
Groucho = framework for in-vivo testing of Java apps. Isolation ensured by checkpoint/rollback strategy, selective thread suspension/resuming. Overhead measured under various configs (number of threads, activating testing session). Overhead found to grow linearly with number of threads, possible to make it imperceptible by reducing activation probability of in-vivo testing (10^-4 when when user base is large).

## An in-vivo testing framework
Groucho combines AOP with lightweight isolation approaches to allow tester to inject tests that can be safely executed at run-time. Four main building blocks:
  - Annotation: defines meta-info to enable/regulate in-vivo testing activities 
  - Instrumentation: uses AOP principles to inject testing aspects within prod
  - Callback: responsible for orchestration and isolation policies
  - Isolation: suspending/resuming threads, checkpoint/rollback strategy (Groucho-Crochet)

#### Scenario: roles and responsibilities
Two main subsets of activities:
- offline, performed by test engineers, annotate methods and identify corresponding test methods of SUT to test in-vivo
- runtime, performed by execution environment (JVM) (Groucho does this through Javaagent implemented using JVM-TI, SUT deployed and launched on JVM with instrumentation capabilities enabled, links annotated methods with Groucho instance running on JVM)
At runtime, Groucho checks if in-vivo testing session should be activated for method. Corresponding test case fetched, isolation policies enforced before actual invocation. Then test case launched from operational context: whole pool of objects in memory (current state and actual references). After testing, Groucho reverts JVM environment to status before testing. Test results reported to test engineers through logs, etc. Then JVM proceeds to execute actual method. These steps keep looping for the duration that the SUT runs on JVM.

#### Annotations
Test engineers establish relations between class methods and corresponding test methods in SUT that should be in-vivo tested. This is done through method annotation `@TestableInVivo(invivoTestClass="...", invivoTest="...")`

#### Isolation
Goal: avoid any corruption to user session
- isolation approaches to preserve state of user sessions: done through checkpoint/rollback (not forking as is it safe but expensive in terms of computational resources and memory). Lazy deep copy of only objects involved, restored after test over. Not well suited for concurrent applications. To ensure data consistency in multi-threaded apps, policies used to enforce selective suspension/resuming of runnable threads.
- isolation approaches to preserve consistency of execution flows in sessions

## Validation methodology
Acceptability for both developers and users of SUT - minimal overhead introduced. Impact originates from two sources:
- overhead from platform:
  - RQ1: what amount of overhead does Groucho introduce, when varying the frequency of in-vivo test execution and number of parallel threads involved?
  - RQ2: what are the configs of Groucho under which its overhead can be considered small or negligible?
- cost of execution of each in-vivo test case - application-specific, responsibility of dev team

First run custom Java application w/o Groucho (javaagent), then with. Execution time compared to benchmark. Custom application defines multiple threads, configured randomly, to perform CPU-intensive and time-consuming tasks. Two independent variables in empirical validation are
- number of active threads
- activation probability of in-vivo testing session

Two experiments:
- First: activation probability fixed, number of active threads in application varied
- Second: activation probability gradually varied, number of active threads in application fixed
Execution time measured as average of multiple runs of application

## Empirical results
- RQ1: The overhead introduced by Groucho grows linearly with the number of threads and with the probability of in-vivo test case execution => fine tuning of the framework’s impact by test engineers, who can reduce the in-vivo activation probability until an acceptable overhead is achieved
- RQ2: When the probability of in-vivo activation is 10^−4 or lower, even with 30 threads executing in parallel, the overhead of Groucho is statistically insignificant and practically negligible or small => applications with a large user base can correspondingly adopt a very low activation probability, making the impact of the framework imperceptible

## Conclusions
In-vivo testing useful in detecting corner cases with real prod environment. Isolation and overhead are important challenges. This paper introduces high-level architecture of Groucho. Groucho supports linear overhead tuning. If activation probability is small, overhead is not noticeable. Isolation performed through rollback/checkpoint.
