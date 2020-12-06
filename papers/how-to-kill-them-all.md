## [How to kill them all: An exploratory study on the impact of code observability on mutation testing](https://www.sciencedirect.com/science/article/pii/S0164121220302545)


### Introduction
- mutation testing - should testing be improved or should production (source) code be refactored?
- mutation testing now being adopted by the industry to improve fault detection capability
- mutation score is linked with test quality, mutant utility
- certain mutants can be killed only after refactoring production code - increase in observability of state changes
- code testability = attributes of code that define how easy/hard it is to validate software product
- code observability = how well internal states of system can be inferred (eg. through external outputs)
  - expression is observable in a test case if change in its value leads to change in the output

Two-fold study:
1. relationship between code testability and observability and mutation testing
2. identification of anti-patterns/indicators to kill surviving mutants

### Background
Mutation testing: fault-based testing technique, mutation adequacy score, introduce syntactic changes acc. to rules (mutation operators), generate faulty versions (mutants), guage ability of test suite to detect fault
  - alternative to coverage metrics which are misleading, statements might be covered but their consequences might not be asserted
  - now being used in the industry
  - Questions: usefulness of mutants, majority of them are equivalent, trivial, redundant => "if a class has a high mutation score while most mutants are trivial and redundant, high mutation score does not promise high test effectiveness" 

Software testability: aka observability and controllability; Propagation, Infection, Execution (PIE) analysis to determine fault sensitivity; OO-metrics (class- and method- level) and their relationship with testability  
  - this study uses 64 of these OO-metrics
  
Code observability: two perspectives: production code, test case; 19 metrics derived from
  - return type of method: hard to observe mutants for void methods since no return value for test cases to assert
  - access modifier: visibility of method (eg private)
  - fault-masking: mutants introduced in certain locations are more likely to be masked => state change does not propagate to output, eg in a nested class, or nested conditions and loops
  - test directness: no test that directly invokes a method, which is otherwise covered by TS => directness influences outcome of mutation testing
  - assertions: mutants without relevant assertions (including exceptions) will not be detected
  
### Experimental setup
Six open-source Java projects; RQ
1. What is the relation between testability metrics and mutation score?
2. What is the relation between observability metrics and mutation score?
3. What is the relation bwtween combination of testability and observability metrics and mutation score?
4. To what extent does removal of anti-patterns based on testability and observability help in improving the mutation score?

Mutation testing with PIT - default mutation operators

6 study subjects: LOC, \#test, \#total-methods, \#selected-methods (at least one generated mutant), \#total-mutants, \#killed

Methodology: "Mutation Observer" - info extracted from source code, bytecode, tests
- Antlr parses source to obtain method features: public, static, no. of conditionals 
- Apache commons BCEL to parse bytecode 
  - Java callgraph to generate pairs of method calls between source code and tests (to get test directness metrics etc)
- PIT for mutation testing

RQ1 to RQ3 => Two-fold: 1) Spearman's rank-order correlation => pairwise correlation between each metric (testability and observability) and mutation score; 2) Random forest for binary classification to see how metrics interact with each other.

1 checks if there is monotonic relationship b/w two data samples, no assumptions on data being tested, output lies in [-1, 1], strength is large if value abs value is >= 0.5. Positive means direct relationship, negative means inverse.  

2 uses random forest for binary classification, 1 or 0. cut-off is 0.5; models based only on testability metrics, only on observability metrics, and a combination of both

RQ4: anti-patterns/smells established on the basis of these metrics (eg `method_length > 20` or `test_distance > 2`); J48 decision tree, manual analysis

### RQ1 to RQ3

1. pair-wise correlation between 64 existing source code metrics and mutation score is not strong (< 0.27); most strongly correlated metrics are NSUP (no of super classes), DIT (depth of inheritance tree), R-R (reuse ratio), HIER (hierarchy of method calls) (all class-level)

2. **Spearman**: correlation between code observability metrics and mutation score is not strong (0.5); better than correlations for existing code metrics. Test directness (`test_distance`, `direct_test_no`) most important, followed by assertion-based metrics (`assertion-density`, `assertion-McCabe` and `assertion_no`); **Random-forest**: Random Forest based on combination of existing code metrics and code observability metrics performs best, then code observability metrics. Test directness ranks highest.

### RQ4
36 most important features from combined model (testability + observability) selected via PCA, j48 decision tree built, top 6 leaves of tree selected for manual analysis => 6 anti-patterns (16 in total, 6 in paper)
Results: code observability metrics can lead to simple refactorings that can allow more mutants to be killed => increased mutation score
- add direct tests if `test_distance > 5`
- add assertions if `test_distance <= 5`
- refactor private methods to public/protected 
- refactor void methods to be non-void
- add additional getter if void method changes private field
=> Some of them break OO design principles, esp one about access modifiers which allows encapsulation. This means there may be a trade-off between mutation score and OO-design. Some OO-design principles hinder testability, and therefore testing (also inheritance and polymorphism). Practitioners must balance. Most obvious hindrances: access modifiers, void methods. Developer can choose to maintain encapsulation or refactor to improve mutation score if testing of that method is a higher priority. Choices: add test cases, refactor production code to kill mutants, ignore surviving mutants

### Conclusions
mutation score <==> testability and observability; code quality metrics (testability) are not strongly correlated with mutation score, but code observability metrics derived from code features and test cases are more strongly correlated with mutation score, esp. test directness (`test_distance` and `direct_test_no`). Anti-patterns established on the basis of code observability metrics. Trade-off between OO-design principles and mutation score, eg. private methods could be refactored.

### NB
- Pseudo-tested methods: extreme mutations, this study: convential mutation
- Further reading: [Coverage is not strongly correlated with test suite effectiveness](https://dl.acm.org/doi/pdf/10.1145/2568225.2568271)

