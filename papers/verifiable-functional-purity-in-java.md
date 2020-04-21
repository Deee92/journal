[Verifiable Functional Purity in Java](https://dl.acm.org/doi/abs/10.1145/1455770.1455793)

Functionally pure methods => deterministic and side-effect free
verification of security properties, function invertibility, computational reproducibility, safe execution of untrusted code, bug reduction

writing programs in a subset of Java called Joe-E
using a static verifier to ensure that programs fall within the subset
In Joe-E, pure methods can be recognized from their signature

### Introduction
high-level security and privacy requirements of critical real-world programs
imperative languages like Java permit side-effects and data dependencies
In purely functional languages, methods obey semantics of mathematical functions => reasoning about effects and information flow easier

Two critical properties must be satisfied for a method to be functionally pure:
- no side-effects: method's execution must not have any visible side-effects other than result generation; a method that modifies its arguments or global variables or causes an external effect like writing to disk or printing to console (I/O) is not side-effect free
- functional determinism: method behavior must depend only on provided arguments, it must return the same answer every time it is invoked on equivalent arguments, even across different executions of the program (eg., a method to uppercase a string)

an application: electronic voting machines - stringent privacy and security requirements, single-purpose, trustworthiness most important, deterministic, no side-effects, serialization and encryption

introduction of a new concept of deterministic object-capability languages - ability to cause side-effects and to observe data that varies between executions is conveyed by explicit object references that are propagated only by explicit program statements
- modular reasoning about purity, side-effects, determinism
- method purity identifiable by simply looking at type signature: if all parameters are immutable, method is pure
- purity specifications are thus part of the method contract
- body of pure method has no additional constraints => wide flexibility on implementation
- pure methods can call impure methods and vice-versa
- program is a mix of pure and impure methods, purity is enforced when needed

### Contributions
- Several applications listed where ability to verify purity of particular blocks of code makes it easy to verify interesting high-level application-specific properties
- class of imperative programming languages described in which it is easy to verify purity
- Joe-E's enforcement of determinism introduced, enables veriable purity in Java
- Refactoring legacy codebases to verify their purity and attain security guarentees
- Identification of programming patterns for writing pure systems, and anti-patterns that make it difficult to do so

### Definitions
#### *functional purity - derived from concept of a mathematical function: a well-defined 1-to-1 mapping from inputs to outputs, method is pure iff it is both side-effect free and deterministic* ####

- Side-effect-freeness: objects that method modifies are created as part of the method execution
=> method permitted to create and modify new objects, not permitted to make any change that is observable from outside it
PLUS no side-effects outside language environment, except resource consumption (CPU, memory); it must not write to files, communicate over the network, or print to console

- determinism: each distinct input associated with a single specific output, results depend on inputs and nothing else - no global or thread-local state such as current time or stack trace

