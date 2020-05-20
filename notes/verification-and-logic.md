## [Introduction to Formal Methods for Design Verification](https://www.youtube.com/watch?v=Uhvtn0iJgWo)

Verification, verification issues, temporal logic, methods used for verification\
Typical development phases
- Specifications for any system - requirements, properties, invariants, allowed (finite) states
- Design - components, interactions, architecture ...
- Implementation
- Testing - test for correctness, oracles, assertions ...
- Installation
- Maintenance

Bugs reported earlier in development cycle => saved resources, reduced cost of debugging\
Introduce verification phase after design phase
- Specifications for any system - requirements, properties, invariants, allowed states
- Design - components, interactions, architecture ...
- **Verification - formal verification for correctness of design**
- Implementation
- Testing - test for correctness, oracles, assertions ...
- Installation
- Maintenance

Simulation of design to verify correctness
- exhaustive - for simpler systems
- non-exhaustive - selective, subset of inputs, may not cover all possible error cases (e.g., Pentium bug)
(Simulation exhaustiveness decreases with system and design complexity)

Formal verification can help solve the problem of non-exhaustive simulation\
Formally capture design, properties, behavior and verify with specs, remove ambiguities\
Deal with an abstract model of the system\
Formal methods help us design this abstract model\
Inputs: system model, a specification (property)

**Formal verification = construction of a model for an application to demonstrate that a certain property holds**
Testing (what is wrong) vs formal verification (why it is wrong)

### Formal verification: approaches (increasing complexity, expressiveness)
- proposiitonal logic: declarative statements
- first-order (predicate) logic
- second-order / higher order logic

### Deductive verification with propositional logic
- boolean formulas with boolean variables and _NOT_, _AND_, _OR_ connectives
- typical use: checking equivalence of two models (_"tautology or equivalence checkers"_)
- decidable, not very expressive

### First-order predicate logic (FOL)
- quantification of a proposition using "_there exist(s)_" and "_for all_"
- some automation of FOL model verifications is feasible
- undecidable, may have cases of doubt

### Higher-order logic (HOL)
- more expressive, complex
- allows functions to be manipulated like other objects
- proofs can hardly ever be automated, must be done manually with some proof support
- interactive theorem provers that need human intervention for hints/inputs

### Temporal logic
- logic extended with a notion of time: "_until_", "_eventually_", "_always_", "_next_"
- capture future behaviours
- linear time
  * models physical time
  * at each instant, only one future behaviour considered
- branching time
  * models different computational sequences of a system
  * at each instant, all possible future behaviours considered
  * non-deterministic selection of path taken
- notions of time
  * discrete time - commonly used, natural numbers to model time
  * continuous time - real numbers
- behaviour
  * qualitative - event will happen sometime in future (_"I will eventually wake up"_)
  * quantitative - event will happen at a specific (quantum of) time in future (_"The alarm will go off after 5 units of time"_)

### Model checking
Process
1. Modeling - build finite-state model of the system
2. Specification - specify properties of the system
3. Verification - method / tool to verify properties
Output: true / error trace

---
## [Temporal Logic: Introduction and Basic Operators](https://www.youtube.com/watch?v=5_nu36oz0vs)

### Temporal logic
- capture timing behaviour
- linear time, branching time
- discrete time, continuous time
- qualitative, quantitative

Temporal logic is defined wrt a model M, which is an infinite sequence of states\
Temporal logic formula is not statically true or false in a model\
A formula can be true in some states, and false in others

_"I am always happy"_\
_"I will eventually be happy"_\
_"I will be happy until I am hungry"_

Two kind of operators:
- logical - AND, OR, NOT
- temporal
  * unary: next (X), eventually (F), always (global G)
  * binary: until (U)

State transition model\
states: S1, S2, S3 ... Sj
Model M models temporal formula phi\
`(M, Si) |= phi`

### Operators
Future logic, reasoning about the state of a system in future

1. Next: X phi **circle**\
`(M, Sj) |= X phi <=> (M, S(j+1)) |= phi`\
phi holds at next state

2. Future / eventuality: F phi ("eventually") **diamond**\
`(M, Sj) |= F phi <=> there exists k, k >= j, (M, Sk) |= phi`\
phi eventually holds

3. Globally / always: G phi **square**\
`(M, Sj) |= G phi <=> for all k, k >= j, (M, Sk) |= phi`\
phi holds globally

4. Until (binary): xi U phi\
`(M, Sj) |= xi U phi <=> there exsits k (M, Sk) |= phi and for all k, j < k (M, Sj) |= xi`\
xi holds until phi holds

Past logic, reasoning about the state of the system in the past

1. Previous (circle with a tilde in the middle)\
`(M, Sj) |= previous phi  <=> (M, S(j-1)) |= phi`\
phi holds in previous state

2. Eventually in the past (diamond with a tilde in the middle)
`(M, Sj) |= eventually in the past phi <=> there exists k, k <= j (M, Sk) |= phi\
phi holds eventually in the past

3. Globally (always) in the past (square with a tilde in the middle)
`(M, Sj) |= globally in the past phi <=> for all k, k <= j (M, Sk) |= phi`
phi holds globally in the past

4. Back to (beta, B)
`(M, Sj) |= phi B xi <=> there exists k (M, Sk) |= xi and for all j >= k (M, Sj) |= phi until present state`\
Or `(M, Sj) |= phi for j = 0 to present state`\

### Examples
P, Q, R are atomic propositions

- _"If I start studying, I will eventually graduate"_\
(P -> FQ)\
If P is true, that implies Q is eventually true

- _"Either I have coffee now or I will sleep"_\
(P v XQ)\
Either P is true or next Q is true

