[Purity and Side Effect Analysis for Java Programs](https://link.springer.com/chapter/10.1007/978-3-540-30579-8_14)

Method is pure if it does not mutate any location that exists in program state right before its invocation

analysis built on top of a combined pointer and escape analysis, able to determine that methods are pure even when they mutate the heap, provided that they mutate only new objects, can also generate regular expressions to characterize externally visible heap locations that method mutates

read-only parameters - method does not mutate any objects transitively reachable from the parameter
safe parameters - parameter is read-only, method does not create new externally visible heap paths to objects transitively reachable from parameter

### Introduction
Side-effect info applications:
- program analysis, understanding, documentation
- program assertions, specifications
- reduction in search space while model-checking

Combined pointer and escape analysis to extract a representation of the heap region that each method may access; using an updated version of Whaley and Rinard pointer analysis
#### *Analysis tracks object creation, local variable updates, object field updates - this helps distinguish objects allocated within method execution from objects that existed before method was invoked*
####
This is also the definition adopted in the JML
#### *=> Pure method can perform mutation on temporary objects (eg., iterators) and/or construct complex object structures and return them as a result* ####

### Contributions
- Purity analysis: new analysis for finding pure methods in unannotated Java programs, track variable and field updates, allow pure methods to mutate newly allocated data structures (=> support for important programming constructs like iterators)
- Experience: analysis in benchmark programs, was able to recognize pure methods that were known to be pure, but were classified as impure because they mutated complex internal data structures
- Beyond purity: analysis detects read-only and safe parameters, plus generates regular expressions that conservatively approximate all externally visible locations that an impure method mutates

