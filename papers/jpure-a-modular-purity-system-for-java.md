[JPure: A Modular Purity System for Java](https://link.springer.com/chapter/10.1007/978-3-642-19861-8_7)

[Downloads](https://homepages.ecs.vuw.ac.nz/~djp/jpure/)

## Abstract
Purity analysis = determining whether or not a method has side-effects

This system uses purity annotations which can be checked modularly
Two properties exploited to increase range of methods that can be considered pure: freshness, locality
Legacy code can also be annotated
System evaluated against several packages in the Java Standard Library

## Introduction
methods that don't update program state are considered pure or side-effect free
applications: specification languages, model-checking, compiler-optimizations, atomicity, query systems, memoization of function calls, automatic parallelisation, extended static checking, ...
Existing techniques use interprocedural pointer analysis as underlying algorithm
Drawbacks:
- requires whole program to be known in advance (static?)
- significant amount of time to run

Useful alternative: annotations
annotate pure methods with `@Pure`, then an efficient purity checker provided to help enforce purity protocol in programs
annotations must be modularly checkable => purity annotations on one method can be checked in isolation from others
Difficulty: legacy code would need to be annotated, Java Standard Library has not been annoated to identify pure methods
Purity system therefore split into two components:
- purity inference: source-to-source translation, takes in existing Java code and adds modularly checkable `@Pure` (plus auxiliary) annotations, potentially expensive
- purity checker: checks correctness of these annotations at compile-time

Users take existing applications, infer `@Pure` annotations once using purity inference, then maintain them using purity checker 
Annotations: `@Pure`, `@Local`, `@Fresh`

### Contributions
- novel purity system, employs modularly checkable annotations, exploits freshness and locality to increase number of pure methods, comprises a purity inference (for legacy code) and a purity checker
- formalization of intraprocedural analysis for both purity checking and purity inference
- several packages of Java Standard Library experimented on, at least 40& of methods found to be pure

### Overview
#### Definition 1: Pure method
method considered pure if it does not assign (directly or indirectly) to any field or array cell that existed before it was called
any method it calls must also be pure
pure methods can only be overridden by methods which are also pure

- Direct field assignment: a `@Pure` method cannot assign to fields, checked by inspecting implementation
- Indirect field assignment: a `@Pure` method may only call methods which are themselves pure, checked by ensuring called method is also `@Pure`
- Method overriding: All overriding methods of a `@Pure` method must also be `@Pure` to account for dynamic method dispatch

### *Purity of a `@Pure` method ensured by inspecting its implementation, and signatures of methods it calls or overrides*

Problems with simple purity can be eliminated by considering two additional factors:
- freshness: method can only return fresh or newly allocated objects (eg., `iter.next()`)
- locality: when child object is in the locality of parent object, we know that the child is fresh if the parent is fresh (eg., string concatenation)

So, three annotations: `@Pure`, `@Local`, `@Fresh`

#### Definition 2: Locality
locality of object = every field defined by its class
locality of those annotated `@Local` = the locality of the referenced object

#### Definition 3: Local method
a local method may modify the locality of any parameter annotated `@Local` but in all other respects, must remain pure. Method receiver (`this`) is treated as a special parameter, with `@Local` placed on the method itself

