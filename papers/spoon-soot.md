### [Spoon](Spoon: A Library for Implementing Analyses and Transformations of Java Source Code)

- [Documentation](https://spoon.gforge.inria.fr/)
- Library for analysis and transformation of Java source code
  - Parses a program (Java source code) to produce an AST, then builds a model of the program
  - The model can then be processed, analyzed, and transformed
- Spoon meta-model:
  - structural elements: class, interface, method...
  - code elements: method body (loops, expressions, ...)
  - reference elements: type/object references
- Processors, filters

### [Soot](https://soot-oss.github.io/soot/)

- [GitHub](https://github.com/soot-oss/soot)
- [Soot - a Java Bytecode Optimization Framework](https://soot-oss.github.io/soot/resources/sable-paper-1999-1.pdf), 1999
- [The Soot framework for Java program analysis: a retrospective](https://soot-oss.github.io/soot/resources/lblh11soot.pdf), 2010
- Static program analysis, bytecode optimization
- Compiles Java bytecode or Java (+ other JVM languages) source code into Java bytecode
- The key features of Soot include 
  - A simplified three-address intermediate representation of Java bytecode (called Jimple, other IRs are Shimple, Baf, and Grimple)
  - A number of pointer analysis and call graph construction algorithms
  - The ability to produce executable Java bytecode as output
- Applications: transformation, static analysis, symbolic execution
