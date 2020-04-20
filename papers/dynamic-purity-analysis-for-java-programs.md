## [Dynamic Purity Analysis for Java Programs](https://dl.acm.org/doi/abs/10.1145/1251535.1251548)

Pure methods in a program are those that exhibit functional or side-effect free behaviour
Existing purity investigations present mostly static results
This paper = detailed examination of dynamic method purity using JVM-based analysis
Considering multiple purity definitions from strong to weak, purity forms specific to dynamic execution, accomodate constraints imposed by an example consumer application, memoization

### Findings:
Dynamic method purity is fairly consistent between programs
Examining pure invocation counts and percentage of bytecode instruction stream contained within some pure method reveals great variation

Weakening purity definitions exposes considerable dynamic purity
Consumer requirements can limit the utility of this information

### Introduction
Methods can mutate externally visible state, access privately available state
Pure method = no externally visible side effects when executed OR
extent of its side effects limited in some way
The extent to which it depends on previously available state may also be constrained

The concept of purity is useful in a variety of contexts
- program understanding and analysis
- isolating and examining functional or side-effect-free fragments
- verification in model-checking
- optimization (improved method purity => less conservative assumptions)
- novel hardware architectures
- caching or memoization of function calls

Extent to which programs exhibit purity not fully investigated
Static analysis shows the existence of large classes of pure methods, but precise definitions for purity vary
Static analysis is also quite conservative wrt runtime behavior and extent to which different kinds of purity are observed dynamically is not clear (different classes of pure methods and their applicability as valuable pieces of information)

This paper
- considers several definitions of purity that range from strong to weak
- investigates both static and dynamic properties of programs
- extends previous work on static analysis
- shows that different forms of purity occur with differing frequencies in a dynamic environment

Weaker forms of purity allow for some impure invocations of a method and expose slightly more purity (future work)

impact of dynamically changing purity properties
Report frequencies of different sources of impurity

Implement a prototype but non-trivial method memoization optimization
Memoization maps arguments to return values, allows for execution of reasonably pure methods to be safely bypassed
Extend traditional definition to consider heap dependencies as inputs
this exposes additional constraints that an abstract model of purity may not consider

### Contributions
- design, implementation of dynamic purity analysis for Java bytecode available online and offline
- support for several different purity definitions that correspond with previous work on static purity analysis + identification of some forms of purity not observable statically
- Three metrics for evaluating extent of dynamic purity - method purity, invocation purity, bytecode purity - results applied to simple static analysis and multiple dynamic analyses corresponding to purity definitions
- JVM implementation of tradiitonal consumer of purity information - memoization

Related work
Purity definitions are based on the kind of operations performed in a method
which classes of data are read and written
side-effect analysis (in compiler optimization)
determining read and write sets in context of functional or procedural languages
OOP languages have additional concerns through use of virtual method dispatch and dynamic memory

Interprocedural side effect analysis for Java based on points-to analysis
Context sensitive points-to information on side-effect information
Object-sensitive points-to and side-effect analysis

Bridging the gap between side-effect analysis and purity:
Conservative, static, side-effect analysis of bytecode
four classes of methods:
- pure => neither reading nor writing data
- read-only => only reading data
- write-only => only writing data
- read/write => least pure

Java Modeling Language is a behavioral interface specification language for Java
Provides a definition of pure method as 
- does not perform I/O
- does not write to any pre-existing objects
- invoke any impure methods
JML is annotation-based, requires purity info be specified by users

Side-effect free methods identified by a form of purity where externally visible writes are not allowed, but reads are permitted
Static analysis to detect side-effect free methods, impact of different call graph construction algorithms on detecting these methods
Side-effect free methods must guarantee matching pre- and post-states, creating and returning new objects disallowed, but can allocate objects locally

Another paper defines that pure methods can read from and write to local objects, and can also create, modify, and return new objects not present in the input state => more statically pure methods identifiable
(THAT IS, no changes to existing objects, new objects allowed)

A large number of statically identified pure methods means a significant optimization opportunity,  but only if these methods are both reached and well-exercised at runtime
So observing actual runtime behavior is important

Dynamic purity analysis - jdynpur - uses ASM to create program traces, identifies impure methods based on writes to non-local objects, compares static and dynamic purity information which can be merged across different program executions

Dynamic analysis of parameter mutability for Java programs, which is one aspect of method purity
Other factors which depend on the consumer may be involved

### Design
Investigation into purity divided into static and dynamic experimental designs

Static analysis implementation based on Soot program analysis framework
Dynamic analysis implementation in the SableVM Java bytecode interpreter
Design of memoization consumer application

#### Static Purity Analysis
Statically a significant number of methods have fairly weak purity properties
A method is strongly pure iff it does not change or depend on any initial state beyond its primitive input values and returns the same results for the same inputs in any context


### *For Java, this means that a stronly pure method does not read from or write to heap or static data, perform synchronization, allocate objects, invoke a native method, throw explicit exceptions, invoke any method not itself identified as strongly pure*


#### Dynamic Purity Analysis
Statically a method is conservatively determined to be pure for all possible executions, otherwise is declared impure
But for a given program run, a method declared impure statically may actually exhibit only pure control flow
Dynamic purity analysis identified methods as pure or impure based on their ACTUAL RUNTIME BEHAVIOR
Thus, more pure methods are identified
Four levels of dynamic purity:
- STRONG: same as strong static purity, but only those strongly pure instructions that are actually executed, and not the whole method body
A method is pure if it returns without encountering any impurity
- MODERATE: Arbitrary method behavior provided that the input state is not altered, objects may be created and altered, provided such objects do not escape the method execution context, may also call impure methods, provided impurity is contained wihin caller; do not change behavior based on input heap or global state; behavior of a moderately pure method is determied exclusively by its primitive input arguments; this method does not invoke native methods, read or write to static or previously existing heap objects, perform monitor operations, throw exceptions, call a moderately impure method ...
- WEAK: heap reads allowed for any reachable objects
- ONCE-IMPURE: previous definitions require purity over the entire course of execution. some impure methods are weakly pure but only after the first invocation
(i.e. first invocation of these methods may be impure)

#### Memoization
Memoization = optimization that caches argument-to-return-value mappings, jumping past actual method execution for repeated invocations with the same arguments
Hash tables
No support for multithreading
Unique result for any given input
Weakly pure methods are also candidates for memoization
And so are once-impure methods because they can be impure for the first invocation and then be weakly pure
So they are not spuriously classified and rejected as impure
Benefit of jumping past execution should be greater than argument-to-return-value lookup time
method must execute long enough for optimization to make sense
good hit rate needed 
amount of input data to be processed is not too large

Experiments, metrics ...

### Conclusion
actual program behavior is not predictable based on purely static observations
Statically pure methods not always well-exercised dynamically
more opportunites diminished

