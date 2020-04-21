## [Exploratory Test Agents for Stateful Software Systems](https://arxiv.org/abs/2004.08219)

### Introduction
Exploratory testing usually manual, done by manual testers, more abstracted and high-level
lack of industry-strength methods to automatically test and explore properties of stateful systems and processes. Present in academia, haven't reached industry.\
Developing, maintaining automatic test cases a lot of work for developers, input domain of non-trivial systems not covered\
Software projects do not spend on automatic test creation, maintenance\
Bugs that need complex interactions to be uncovered are discovered by humans, possibly users\
To test microservices, tests run continuosly in complex environments where complex interactions can be explored\
Developers and testers need automatically generated test cases, esp in cases where there are too few of them\
Possibility of designing and using exploratory software test agents to reduce manual testing burden, increase coverage of stateful interactions, and increase knowledge of SUT behavior.\
this done using and evaluating existing methods:
- model-based testing (MBT)
- property-based testing (PBT)

To "explore" SUT at end-user level, a test agent needs to interact with it via GUIs or APIs, plus a model of how a user can behave\
A model that allows fast test iterations would be ideal, will lower risk of finding faults later in development cycle, where cost of fixing it would be higher. An intelligent agent may need training\
Results from test agent run analyzed by domain expert, evaluated to see if test goals were met, used as source of knowledge for future learning\
Main goal of this automatic exploratory testing strategy is to ease the burden of testing from developers and testers\

***Test agent goals and interactions should therefore be carefully defined***

### Contributions
- interaction models for test agents (explicit or implicit)
- method to define exploratory agent goals
- recommendations for formulation of assertions of exploratory test results data
- methods to analyze and learn from exploratory test results

### Definitions
- Exploratory: a test agent exploring an SUT would help us discover what we do not know about it (bugs, possible interactions, performance properties, meta-properties like log handling)
- Test agents: a test agent senses and acts according to its goals, possibly autonomous and intelligent, able to interact with other test agents, decide how to run, learn from past runs and adapt to environment; could also be non-intelligent, based on situation

### Proposed approach
- single testing agent: for simpler scenarios that test one aspect of system, not requiring complex interactions
- group of testing agents: several agents work together, varying levels of intelligence, exercise and explore SUT in diverse ways to expose faults and increase knowledge of system behavior; would expose hard to find errors in long running stateful processes, help developers shorten feedback cycle of testing, testers to focus testing efforts on highest levels and evaluation of agent output.\
For several agents to work together, they will need a common way to express results and goals, and a likely monitoring agent that works at a higher-level than other lower-level agents.

Some examples of different kinds of agents with different sensors and goals:
- fuzzing agent: senses service specification, applies fuzzed inputs, observes crashes
- smoke-test agent: senses system redeployment, runs a basic path exercising system, observes differences from previous runs
- chaos agent: stops and restarts services, introduces latencies, observes resilience of systems
- security agent: assesses services based on best security practices

### Agent interaction
Interaction model for automatic exploratory testing by agents must also be defined at a high level.
In MBT, model is separate from implementation. Requirements may not be correctly implemented or their implementation may be missing altogether.
Some interaction models that may be used by exploratory test agents:
- Implicit model: eg., an existing GUI
- Explicit model: a model artifact, eg., FSM
- API: Other API-describing artifacts, eg., Swagger documentation

Trade-off between implicit and explicit interaction models:
- if model explicitly built, developer effort expended
- if model not explicitly built, agent must spend more time to learn how to interact with SUT from test runs

### Agent goals
Goals on different levels of exploration defined, based on interaction model\
Goals must be on the level of abstraction of human testers, i.e. acceptance level, and not unit- or integration-level\
For explicit interaction models like FSM, agent goals would be to cover all states in the model\
For implicit interaction models like GUI, agent must learn from test runs, observe difference between runs to generate oracles\
Goals can also be meta-level, like observing logs of the system, system recovery, performance and resource consumptions

### Agent assertions
Results from agent test runs are recorded, oracles have to be generated for assertions from these results
Differences between test runs considered, possibly property-based assertions generated
*Example: Number of items found in this list should be the difference between the number of times items were created and the number of times items were deleted.*\
Agents should also be able to assert on unexpected system behavior. Given previous results, agent could learn and notify on any deviance.

### Empirical Studies and current status
Early stage. Smoke-testing agent deployed at the back-end, runs continuously. Swagger documented API as interaction model. First step towards an intelligent agent.\
Concepts and principles proposed deployed and empirically studied in an industrial setting with real projects in development

