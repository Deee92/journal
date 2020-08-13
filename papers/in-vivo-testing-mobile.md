## [A Framework for In-Vivo Testing of Mobile Applications](https://ieeexplore.ieee.org/document/9159091)

[https://github.com/invivo-testing/icst2020](GitHub)

Mobile environment highly dynamic - variations in platform - device, hardware, OS, version, configurations, user preferences and settings, etc. Exhaustive testing impossible, unaffordable. App may misbehave in the field. Framework developed to monitor configuration in the field, triggers in-vivo testing when untested configuration encountered. Results: overhead introduced by monitoring is insignificant.

### Introduction
Some faults are field-intrinsic - only show up for a certain combination of configurations, impossible to replicate outside of environment. Testing in field thus appealing. In-vivo testing expensive in terms of overhead, should be minimized for user acceptability.\
VATE - framework developed for Android, supports in-vivo monitoring and testing of new app configurations. Managed profiles to isolate in-vivo testing session from normal user session. Testing takes place when device screen is locked. Benchmarked on six Android apps.

### Motivating example
Hypothetical Android messaging app called ChatApp - text + multimedia, allows user to take picture to set as profile picture, transfers intent to camera app - potential failure due to many factors.
- Environment configuration: Constraints defined by tuples with the following info
  - DeviceConfig: Android version, camera app (default/other), actual device model (make)
  - AppPrefs: Upload and backup settings (wifi, data, both)
- In-vivo testing of ChatApp: VATE has run-time probes to check if current configuration (tuple) is tested, untested, unknown; Different categories trigger different responses.
  - untested configuration: in-vivo test execution triggered
  - unknown configuration: feedback to testers asking to extend model to include new cases, additionally immediately validate with available test cases

### The VATE framework
1. Functional, non-functional requirements:
  - FR-TestSpace: framework should be able to read a config model and a set of tested configs from persistent storage
  - FR-ActualConf: framework should expose interface to be implemented by AUT to determine the config of the execution environment in which AUT is deployed and operated (`getConfiguration`), as well as an interface to inform framework of new/updated config ((`sendConfiguration`, `updateConfiguration`))
  - FR-CheckConf: framework should identify config of execution environment as tested, untested, unknown
  - FR-TestExec: framework should be able to retrieve, execute in-vivo/ex-vivo tests for untested configs
  - FR-TestGen: framework should be able to generate in-vivo/ex-vivo tests for unknown configs, with or without manual intervention
  - FR-SelfHeal: framework should expose interface to be implemented by AUT to activate failure prevention/self-healing mechanisms for failing in-vivo/ex-vivo test executions
  - FR-Isolation: framework should isolate in-vivo test executions so that they don't interfere with regular operation of AUT and not have side-effects (modify persistent user data)
  - NFR-PerfChecking: framework should not impose unacceptable levels of overhead when monitoring and checking for configs on deployed AUT
  - NFR-PerfTesting: framework should not impose unacceptable levels of performance overhead when running tests on deployed AUT
  - NFR-Network: network data usage overhead should be acceptable
  - NFR-Energy: energy consumption from framework execution should be low
  - NFR-Privacy: framework must ensure security of client user in handling resources

2. VATE architecture
Client-server architecture to satisfy requirements
- Client-side = AUT and VATE in-vivo framework. Client runs in user devices, manages in-vivo testing process for AUT. VATE framework organized in two layers: one layer of interfaces implemented by AUT, another layer to manage in-vivo testing and server interactions.
- Server runs remotely, controls in-vivo testing process by interacting with all devices augmented with framework; if test cases cannot be executed in-vivo, server can also run them ex-vivo

3. Client-side components
4 client-side components orchestrated by ClientService, which offers the same entry point for all components
- Configuration manager: monitors configs (hardware, software settings) that influence AUT behaviour, done partially autonomously and partially with AUT, triggers test case execution, notifies server of the existence of unexpected configs; Three possible results:
  - Tested config: valid config acc to Configuration Model, included in tested configs, has been exercised either in pre-release or in-vivo testing => NOTHING DONE
  - Untested config: valid config acc to Configuration Model, not included in tested configs, never exercised in pre-release or in-vivo testing => Test Manager asked to validate it by running the in-vivo test cases
  - Unknown config: not valid acc to Configuration Model => Server notified of incompleteness indentified in Configuration Model so that it can be fixed
- Configuration interface: read-only interface used by configuration manager to extract current app configuration
- Test Manager: runs in-vivo testing process, reports results to server, updates local test suite
- Storage Manager: stores and updates persistent data that characterize the in-vivo testing process: configuration model and test manager.
- Self-healing Manager: activates counter-measures when failures are detected

### Android VATE framework
VATE framework is general, can be instantiated in multiple contexts using different technologies. Most relevant use case is for Android ecosystem, apps must work correctly in very heterogenous environments.
1. Configuration management - feature model for app, includes hardware and OS configs, app-specific settings
2. In-vivo testing: set of (unit, integration, system) test cases executed on the client-side to test untested configs. Unit and integration tests using JUnit, system with modified Espresso. Test cases must stimulate AUT, AUT must include a method to launch test cases
3. Isolation: test case execution should have minimal intrusion wrt user activity. Managed profiles used for in-vivo testing - isolation (no data shared with app running in regular profile) and sandboxing (install, remove app after running tests, grant/revoke permissions to prevent info leakage). Apps tested with testing profile and same configs. Unit and integration tests performed transparently. 1 system test case executed just as screen getting locked. If multiple devices with the same configuration, server distributes system testing tasks to reduce impact on single user/device.

### Empirical evaluation
1. Research questions
  - RQ1: What parts of feature models were reverse engineered automatically by VATE, what parts required manual intervention
  - RQ2: What is the overhead introduced by VATE when monitoring normal executions
  - RQ3: For how long does VATE preempt usage of end-user device during test execution

2. Subjects
6 open-source apps (so VATE can be integrated) whose behaviour changes with change in preferences. New Android version, one app per domain. Test cases for these apps already generated by tool called [PreFest](https://github.com/Prefest2018/Prefest) to test user-preference- or configuration-related programming defects. Those test cases reused.

3. Procedure and metrics
- For RQ1, investigate the proportion of app preferences automatically mapped to config feature model by VATE. VATE applied to all subject apps to get feature model from app preferences. For each app, features directly (automatically) mapped to feature model by VATE (direct), features mapped by applying manually defined, general heuristics available in VATE (heuristics), those VATE could not map automatically (unsupported) counted.
- For RQ2, Google Firebase test-lab (various device, OS, CPU, memory configs available) to test apps in the cloud - detailed analytics, resource consumption of AUT. Two versions of each app run - original app, app integrated with VATE. Metrics: average CPU load (consumption), memory in MB, total amount of data exhanged via network interface in KB. Apps executed in typical end-user execution scenarios (including main app functionalities); each scenario recorded as Espresso test case. Four Espresso test cases for each app corresponding to four main functional requirements of each app => metrics measured for these. Each executed 10 times.
- For RQ3, test cases run on a physical device, execution time measured, which equals time taken by VATE to perform in-vivo testing when devide is about to be locked.

### Experimental results
- Mapping of preferences to feature model: 30 apps tried instead of just 6. VATE could directly map \~70% features on average.
- Analysis of VATE overhead: CPU load is always below 6%, memory overhead is less than 1.5%, network overhead is less than 6KB per client-server interaction.
- Analysis of in-vivo test execution time: Time taken to run a system test with VATE; these measures provide an estimate of the locking delay that may be experienced by users who allow the execution of system tests on their device. This time was consistently under 5 seconds after screen lock was triggered.

### Threats
1. External: 6 apps, test cases defined by [authors of PreFest](https://dl.acm.org/doi/abs/10.1145/3338906.3338980?casa_token=OI9i0kJYAsgAAAAA:jd_MaiToKHcvzrKcz0IiGFa28yS3eevXk1jySpkhI2ZC28b2WxeFmbnkjfj2XjZ2ldixHVHNWX3jVg), designed to exercise preference-dependent portions of application code. May not generalize to other kinds of apps/test cases.
2. Internal: Main functionalities exercised as per official app description, overhead may change under different usage conditions

### Related work
- Isolating in-vivo test execution
- Preference-based testing
- Empirical studies on field failures

### Conclusion
VATE = framework for in-vivo testing of Android apps, negligible overhead measured on end-user executions. In fufure, test-case generation in response to newly discovered configurations, also extension to web apps.
