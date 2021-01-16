[To Mock or Not to Mock? An Empirical Study on Mocking Practices](https://ieeexplore.ieee.org/abstract/document/7962389)

- automated unit test development, software artifacts may have several dependencies - instantiate them or use mocks
- **This paper**: which dependencies developers do and do not mock, and why, what challenges developers face; tool: MockExtractor - mines usage of mock objects in testing code, systems: 3 OSS and 1 industrial; manual analysis of 2k+ test dependencies; findings discussed with developers of these systems, rationales, challenges, practices. survey with 100+ professionals
- **Findings**: usage of mocks highly dependent on responsibility and architectural concern of class, dependencies that make testing difficult usually mocked, classes that encapsulate domain concepts/rules usually not mocked; Challenges: maintaining mock behaviour with behaviour or original class, mocking increases coupling between test and prod code

## Research questions
1. What test dependencies do developers mock?
2. Why do developers decide to (not) mock specific dependencies?
3. Which are the main challenges experienced with testing using mocks?
See [Mock objects for testing java systems - Why and how developers use them, and how they evolve](https://github.com/Deee92/journal/blob/master/papers/mocking/mock-objects-testing-java.md) for an extension of this paper with two more RQs (4, 5).

