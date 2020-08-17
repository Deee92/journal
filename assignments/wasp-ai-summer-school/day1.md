## Day 1

### Modern topics in AI
Modules:
1. Algorithmic fairness - TH
2. A new theory of learning - AE
3. Gaussian processes and Bayesian optimization - LN
4. Shallow learning for games - JW
5. Safe AI - GS

Challenge: Reinforcement training, Minecraft - Train agent to find its way to E-huset
- [MineRL: Towards AI in Minecraft](https://minerl.io/)
- [Github - LTH block world](https://github.com/lunduniversity/lth-block-world)
- Group of 3-5
- Optional: minecraft

### Introduction to Algorithmic Fairness
- Theoretical CS -> Design and analysis of algorithms
- Provable properties for well-defined problems:
  - correctness
  - solution quality
  - resource use
- Explainability, ...
- Aesthetics - simplicity, clarity, elegance
- Values - accessibility, security, privacy
- Prediction: classification, risk assessment - predicting the state of a subject
- Issues with training data: imperfect, bad collection methods, incomplete, non-uniform in distribution, biased
- Recidivism: (low, medium, high) probability of re-offense by a defendant - Predictor is a human judge or algorithmic tool (COMPAS in the US) - Article called "Machine Bias"
- Calibration - calibration impossible unless the classifier is perfect, or the groups have the same base rate
- Six ways of group fairness
- Individual fairness: if x and y are really similar then they are treated the same
- Individual and group fairness cannot be satisfied simultaneously

### What algorithms are
- Not a blackbox
- _Numbers_ - abstract representation, universal, scalable (like the alphabet, or musical notations)
  - Transmission of new ideas by reusing a universal set of characters from a small 'alphabet' 
- Algorithms (al-Khwarizmi) - expression of process (temporal aspect)
  - Lovelace -> Turing -> von Neumann -> Jobs
  - Universal (domain-independent), finite, legible

### Values
- Clarity - unambiguous, explicit, legible
- Correctness - formally verifiable (through formal logic), rigorous (different from empirical verification/testing)
- Efficiency - analysis of running time based on input space
- Privacy - increasing entropy
- Truth - Finding the true value when different sources give different values (e.g., second highest bidder)
- Fairness - how are different data points handled?
Examples:
- Finding the maximum number/maximum quartile numbers from a set of numbers, selecting who gets a grant/promotion/is shown an ad for furniture/...

### Individual fairness
- Fairness through Awareness, 2011
- A set of possible decisions (person gets a job, object is a cat). S = {0, 1}
- delta S = set of distributions over S (0 or 1)
- Population P = {1, 2, ..., n}
- Classifier f - maps population to distribution of S (`f: P -> delta(S)`)
- Example of population observables (feature points/parameters/attributes): `x = (height, age, harp-playing, aqueduct-building)`
- A good Roman person is good at aqueduct-building and terrible at harp-playing 
- A good Greek person is good at harp-playing and terrible at aqueduct-building 
- To make a good (and fair) prediction, add a fifth parameter to x => nationality; `x = (height, age, harp-playing, aqueduct-building, nationality)`
- In the real world, these "protected" attributes are race, gender(, age, ...)
- **Similar individuals should be treated similarly** (i.e., two Greek individuals, and two Roman individuals) (Lipschitz)
- d(x, y) <= epsilon => D(f(x), f(y)) <= epsilon
- Utility function: `L: P x S -> R`

### Group fairness
Three random variables:
- Output of classifier, S = {0, 1} (appointed general in the army, gets a promotion, ...)
- Data group, G = {0, 1} (male/female, asian/non-asian, ...)
- Target attribute/talent, T = {0, 1} (harp-playing, aqueduct-building)
Very good classifier - selected data points = talented data points\
A popular notion of fairness - equal representation (of both kinds of data groups, 0 and 1)\
Three notions of group fairness:
1. S independent of G => "_demographic parity_" (belongingness to a group should not dictate the output of the classifier)
2. S independent of T => "_arbitrariness_" or "_randomness_" (output of the classifier should not be based on talent) (like a lottery, coin-flip, US jury duty)
3. T independent of G => "_equality_" or "_equal base rate_" (belongingness to a group does not dictate the talent)
**Def**: Random variables A and B are conditionally independent given random variable C
`(A conditionally indendepent of B) given C`. This gives three more notions of fairness:
1. (S conditionally independent of G) given T => "_equal odds_" (if you're talented, your chance of selection/not getting selected should be the same; likewise if you're untalented)
2. (S conditionally independent of T) given G => "_group aware but arbitrary_" (if you belong to a group, your chance of selection is independent of your talent (Danish military and women))
3. (T conditionally independent of G) given S => "_predictive parity_" or "_teacher/employer perspective_" (if you're selected, there are equal chances that you're equally talented irrespective of the group you belong to)
