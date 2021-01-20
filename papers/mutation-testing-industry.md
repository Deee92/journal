## [What It Would Take to Use Mutation Testing in Industry--A Study at Facebook](https://arxiv.org/abs/2010.13464)

- mutation testing: many small deviations from program - "mutants", way to assess quality of test suite
- infeasible at scale, for a system like Facebook (fb)
- reduce mutants that are useless, give no actionable signal to developers
- solution: semi-automatically learn error-inducing patterns from common Java coding errors + context-specific "changes that cause operational anomalies at fb"
- mutation combined with instrumentation to measure which tests visit mutated piece of code
- results:
  - > 15k generated mutants, more than half survive fb test suite with unit, integration, system tests
  - 24/26 developers found these test inadequacies interesting, 13/26 found them actionable (creating new test/modifying existing)

### Introduction
Mutants generated by applying a mutation operator on the original program, checking if test suite kills these mutants (at least one previously passing test case fails)
- deleting method call
- disabling if condition
- replacing a magic constant
- ...
Mutation score - mutants killed/mutants generated - considered as a better metric than coverage

Traditional mutation approach is problematic:
- too many possible mutations, expensive for any non-trivial program 
- unclear how mutation score should be increased

Goals:
- make mutation testing feasible at scale (fb), create "useful and actionable" mutants that are not killed
- actionable to individual developer

Implementation: "Mutation monkey", empirically learns from error-inducing patterns from a corpus of common Java coding errors and changes that caused operational anomalies at fb
- **novelty**: learned mutation operators used in the industry
- developers told which mutants slipped through test suite + which tests visited but failed to kill mutation: actionable, developers can add/modify unit tests to kill these mutants
- Two empirical case studies:
  - RQ1: mutation pipeline executed for two months to determine effectiveness of mutation monkey
  - RQ2: randomized controlled trial with 26 software engineers at fb, to determine degree to which location-based mutation testing can incentivize creation of tests
- Mutation Monkey created 15K+ mutants from 16 learned mutation operators, survival rate of all ~60-70% (greater than generic mutation operators)
  - **_Using learned and more realistic mutation operators makes mutation testing more efficient and usable at scale_**
  - almost all developers find these test inadequacies helpful

#### Contributions
- semi-automatic learning of mutation operators based on common Java bug patters (Defects4J) and fb-specific anomalies to obtain realistic mutants
- industrial implementation and deployment at fb for mobile code base - Mutation Monkey
- empirical study of mutation monkey on performance of mutation testing and user study part with 26 developers

### Background
- Mutation testing: 1970s, traditional mutation operators do not expose real-world faults
- Petrović and Ivanković at Google used 5 mutation operators to generate and surface 150k mutants
- This study: common Java coding errors + changes that caused outages at fb => real-world
- Getafix: core component of mutation monkey, automatically learns and applies code fixes to bugs uncovered by static analysis
  - trained with a pair containing AST of piece of code before and after bug-fixing; Getafix learns from the diff, learns fixes for a wide range of bugs at different levels of granularity.
- Change-based testing: comprehensive test suite, ML-based test execution when code change pushed; Sapienz: further automated quality checks, search-based automated testing approach; Mutation monkey integrated to this environment

### Mutation monkey
Two process in pipeline: training, application
1. Training: semi-automatically learning new mutation operators from past changes
 - Getafix learns from different data sources: Defects4J, production crashes, test failures => total 19 patterns; these are converted to mutation templates manually => learning process is semi-automatic
 - Steps: prepare datasets, learn and rank patterns, manual parameter tuning and selection, add to template catalogue
2. Application: automatically apply learned mutation operators to generate mutants
  - mutation operators applied to working code (except logging etc), syntax-checker filters out syntactically invalid mutants, present mutants that are not killed
  - test location logging: logging statement around mutation, tells which test visits it, how many times
  - Steps: choose diffs, apply patterns, test mutated diffs, present mutants to developers
  
### Quantitative evaluation
RQ1: diffs selected randomly by mutation monkey a day touching its fbandroid platform, non-Java filtered out, tries to apply mutation operators sequentially on changed Java lines in given diff, until first successful templating.
- mutation operators' kill rate stabilizes between 30% to 40% across experiments

### User study
_Question: which 29 unkilled mutants?_

RQ2: randomized controlled trial with 26 developers (authors of diffs with unkilled mutants) to assess if mutants indeed revelead a possibly missing test, and if developers would act on them; 
- developer response varied: some want missing tests to be generated automatically, some say the piece of code is not very important, not stabilized/mature and will undergo further changes during future iterations, or that it's low priority (no time to write a test for it), or that the state of testing for code in question is lacking.
