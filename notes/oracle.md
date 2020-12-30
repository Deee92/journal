## [Test oracle](https://en.wikipedia.org/wiki/Test_oracle)

- mechanism to determine whether a test has passed or failed
- comparing output of SUT for a given test input to expected/desired/correct output
- **oracle problem**: determining the oracle (correct output) of SUT for given test input and program state; controllobility and observability

### Categories
1. specified: formal specification, MBT, protocol-conformance testing, state-transition specification, design by contract; Example: specifications and documentation
2. derived: correct and incorrect behaviour dervied from system artefacts, such as documentation, system execution results. Example: usage or installation guide, regression test suites built on the assumption that previous system version results, performance characteristics, and textual documentation can be used as oracles for future system versions; **pseudo-oracles** are separately written programs which can take the same input as SUT so that their outputs may be compared to understand if there are issues, such as a similar product which uses a different algorithm; comparing results of one test execution to another.
3. implicit: rely on implied information and assumptions, e.g., from a program crash, or through fuzzing; disadvantages: there might be false positives and incorrect conclusions
4. human: when the above can't be used, quantitative or qualitative approaches used guided by heuristics. Quantitative: right amount of info to gather on SUT to make decisions about correct behaviour; Qualitative: suitability of input test data and context of output from SUT; Example: manual analysis, image detection - human can decide if output is correct.

