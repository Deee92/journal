## [Generating Unit Tests for Documentation](https://arxiv.org/pdf/2005.08750.pdf)
[GitHub](https://github.com/prmr/DScribe-Research)

software projects capture info via many artifacts - source code, tests, documentation\
these often have redundant info => source code also tested and documented\
can lead to inconsistencies and reduced documentation quality\
tool-supported technique DScribe - leverages redundancy between tests and documentation to generate consistent, checkable documenation and unit tests based on single source of info\
DScribe generates unit tests, documentation fragments - novel template and artifact generation technology\
provides mechanism to automatically detect and replace outdated info\
Apache Commons IO library => 835 specs about exception handling, 85% not tested or correctly documented\
DScribe automatically generated 97% of the tests and documentation

### Introduction
Mature software frameworks, libaries => extensive test suites and reference documentation\
unit tests and documentation => different activities, different purposes\
creation involves expressing similar info in different software artifacts => must be kept consistent\
method throws a certain exception => unit test must check that, it should be documented\
current practices:
1. manually created tests and documentation are redundant
2. risk of inconsistencies
3. redundancy may lead to repetitiveness of testing and documentation effort

Goal: leverage redundancy and repetitiveness of info in software artifacts to reduce developer effort\
design space explored by fully developing prototype technique DScribe that can generate unit tests for Java systems\
DScribe is a tool-supported technique for transforming facts about methods between different types of equivalent representations\
relies on a database of fact templates to instantiate a specific fact about method into a unit test and corresponding block of documentation\
Desgin of DScribe incorporates a new template definition language and original algorithms to aggregate related fragments of documentation into a cohesive unit\
85% specs about exceptions thrown by methods in apache commons io are untested, undocumented, both\
DScribe could fix 97% of these inconsistencies\
Main contributions:
1. complete design and implementation of prototype technique for generating unit tests for documentation
2. insights about the rationale for important design and implementation solutions
3. three empirical studies illustrating potential for generating unit tests for documentation

### Overview
__DScribe transforms facts about software elements between different types of equivalent representations__\
current implementation: facts relate to a single public Java method called focal method\
example: if focal method receives null as argument, it throws NPE\
this info is encoded in method in the form of its implementation\
this same info can also be encoded in the unit test or the natural language documentation\
=> redundant representations\
minor variations of the same fact can also apply to different methods => repetitiveness\
DScribe comprises a db of fact templates\
each template captures one common kind of fact\
"_method X throws an exception of type Y when argument is Z_"\
template has placeholders for flexibility of use in different contexts\
Users invoke a template to instantiate a specific fact about a method\
template invocation provides the values for the placeholders of template for a given focal method\
template invocations serve as a common basis for all representations of facts\
in practice, template invocations are used to produce two representations of facts: header comments for documentation (Javadoc), unit tests (JUnit)
Key terms:
1. focal method
2. fact
3. template
4. placeholder
5. template invocation
6. Javadoc
7. JUnit

Technical and implementation challenges for different components in a table\
combination of automatically generated tests and documentation => documentation is traceable to source code via its connectedness to unit tests\
documentation captured by unit tests made explicit easily accessible\
once generated, tests and documentation are independent of generation framework

### Templates and invocations
main innovations of DScribe\
templates encapsulate as many common facts as possible without unncessary repitition\
template invocations encapsulate remaining info that is method-specific
1. Template definition language
DScribe templates contain a partial AST of a unit test and a partial natural language description\
partial because they have placeholders that are not specified until invocation\
each placeholder has a unique name surrounded by $ signs, e.g., `$method$ throws an exception $ex$ when $state$`\
=> a template is the aggregation of a list of placeholders, an AST rooted at a method declaration, and a natural language description\
template should be self-contained and also flexible\
its purpose should be understandable by reading the description and the AST, and also applicable to different contexts or methods\
catalog of templates => knowledge base + documentation and unit tests\
catalog of templates written in Java => understandable, extensible, ...\
`@Template("ExampleTemplate")` annotation for template called ExampleTemplate\
AST of method declaration => AST of template\
header comment of method => description\
placeholder name begins and ends in $\
`@Types` declares the list of placeholders

2. Template invocations
records application of a template to a focal method\
invocations need an invocation context that consists of the signature of the focal method and values for placeholders
- method signature: needed to correctly link generated tests and documentation, provide values of predefined placeholders (`$method$`), default package and Java type to resolve other placeholders
- set of values to assign to placeholders: placeholders replaced with user-provided values with minimum transformation, so they cannot be expressions that first have to be evaluated
invocation files formatted using JSON - serialization and deserialization easy\
only as much info as needed\
invocation files are not self-contained, depend on definition of relevant templates to generate useful info

### Unit test and documentation generation
three step process for both tests and documentation:
1. for each invocation, identify template being invoked and validate the values of the invocation => ensures that invocation refers to a valid template, its focal method exists, each placeholder value can be correctly substituted, esp important for compilable unit tests
2. generate artifact (unit test or documentation fragment) by substituting each placeholder with the value that the invocation provides
3. combine artifacts generated individually and integrate them with the rest of the system wihout disrupting it - generated unit tests are integrated within the existing test suite, generated documentation is integrated directly in the source code as header comments for documentation; also remove outdated generated artifacts, aggregate similar generated artifacts to reduce repetitiveness

Placeholder types: 
during test generation, value replacing placeholder depends on syntactic rules and location of placeholder in template. Placeholder types supported are:
- TYPE
- EXCEPTION
- METHOD
- FIELD
- EXPR - syntacically legal Java expressions
- EXPR_LIST - variable number of expressions, usually method arguments

```
$type$ x = $expr$ ;
Object y = x.$method$($exprlist$) ;
System.out.println(y.$field$) ;
throw new $exception$() ;
```

Integration of unit tests with existing test suite:
implementation challenge; through placeholders, each template defines name of class and package where generated tests have to be placed\
DScribe groups together all tests that go in the same file, writes one file for each test class\
each unit test is independent, large number of similar tests in test suite is no problem\
All generated tests placed in a separate folder defined by user\
manually and automatically written tests are thus separated and coexistent\
template invocations can use stubs and helper methods from main test suite\
if DScribe executed again, old DScribe tests overwritten by new ones => outdated tests removed

Information aggregation:
focal methods with multiple similar facts that need to be tested and documented\
documentation generated as header comments should ideally be aggregated in such cases
e.g., log(double) => NaN for negative numbers, and NaN for NaN <=> NaN for NaN or negative numbers\
Documentation is divided into two statements:
- condition
- consequence
if condition is true, consequence must also be true\
each statement is composed of three parts:
- subject
- relation
- object
e.g., condition : "a is negative"\
consequence: "result is NaN"\
subjects: "a", "result"\
relations: "is", "is"\
objects: "negative", "NaN"\
Thus, natural language description associated with a template divided into six parts which map naturally to most specs\
each part can have placeholders => more flexibility\
no NLP techniques needed\
if two or more conditions share the same consequences (or vice versa), they are aggregated
Full example:
"if a is NaN, result is NaN,\
If a is negative, result is NaN\
=> If a is NaN or negative, result is NaN\
If aggregation not possible, documentation free-formed

Integration of documentation with code:
DScribe inserts generated documentation fragments annotated with @dscribe into header comments of focal methods\
documentation is thus explicitly linked to method it applies to\
=> template linked to documentation

### Overview of empirical assessment
Research questions:
1. to what extent is info in source code, unit tests, documentation inconsistent
2. to what extent can DScribe templates be used automatically test and document behaviors of focal methods

Three-stage process:
1. usefulness study: in-depth study in a narrow context with commons-io
2. validation study: multi-case study to validate findings of the first study in a broader context with commons-math, commons-lang, commongs-config
3. limitiations study: empirical study to understand limitiations in diverse scenarios with 5 open source projects

### Usefulness study
investigate usefulness of DScribe to prevent inconsistencies\
two aims:
1. understanding the nature of problem of info repetitiveness and redundancy
2. assessing DScribe's potential to avoid future inconsistencies by automating the generation of repetitiveness and redundant info

Usefulness study design: define what constitutes a cohesive unit of info about a method\
info includes units of spec regarding exceptions, parameter types, edge cases, return types\
narrow down to specs about exceptions: for a method, source code, unit test, and documentation should give the same info about thrown exceptions\
ESU = Exception Specification Unit\
commons-io v2.6 - well-defined ESUs, extensively documented and tested\
152 top-level Java types- focus only on public types in root package org.apache.commons.io\
Exclude abstract, deprecated, exception types => 11 remaining classes, 293 public non-deprecated methods - ESUs identified for those\
exceptions directly thrown or by nested calls\
for each exception, type of exception thrown, state that triggers exception, which of source code, unit test, documentation captured ESU, DScribe template that can generate the ESU\
if no existing template can capture the ESU, generate a new one\
849 ESUs identified - correctness of 14 not established, these diregarded

Results and discussion: RQ1: 85% of identified ESUs missing in at least one of the documentation, test suite, or source code\
82% ESUs are untested => documentation could be silently inaccurate\
ESU was sometimes only vaguely described in documentation => some did not include exception type...\
RQ2: 97% of identified ESUs could be captured by a template invocation => DScribe's potential\
Each invocation would lead to a unit test and a documentation fragment\
templates were also highly reusable

Threats to validity: authors not part of dev team - manual investigation - may have missed / misunderstood\
focus on exception handling - may not generalize to other sorts of specs\
only 11 classes studied\
Only some templates selected

### Validation study
multi-case study to validate and expand findings of initial case study with commons-io

validation study design: units of spec found in unit tests\
restricts scope to testable and tested specs\
commons-math v3.5 - 3757 tests\
commons-lang v3.8.1 - 3086 tests\
commons-configuration v2.4 - 2554 tests\
picked 370 tests where only one method was being tested 
for each unit of spec, author noted whether and how it was described in documentation (no info, info - partial, documented, not documented)

Results and discussion: 
42% tests captured at lease one unit of spec => a significant amount of tests need to be kept consistent with documentation

### Limitations study
potential effectiveness of DScribe\
qualitative multi-case study on five open source projects to assess strengths and weaknesses of template-based approach

Limitations study design:
5 open source projects at least 15 years old, different app domains\
One author annotated subset of test suite of each based on unit under test, purpose, format, recurrent patterns ...

Ressults and discussion: Eight technical factors that can impact ability to generate tests from templates, quality of generated tests
- Generic variable names: variable names like input and expected in unit tests easier to understand and read 
- structured test names: conventions are an advantage of template-based approach, meaningful names for tests
- recurrent complex operations: diverging implementation of similar operations
- complex assertions: mocks, calling seemingly unrelated methods to trigger assertions => not good with templates
- testing preconditions: assertions to input state of tested object before method under test performed
- constrained resources: additional setup and cleanup for connection to servers, multiple threads, file IO
- different units under test: unit test not always a single method
- variety of test purpose: testing usual behavior or exceptional behavior/corner cases

### Conclusion
Documentation, unit tests, source code for focal method represent the same info -> redundancies and inconsistencies\
DScribe can decouple aspects of unit testing and documentation to relieve developers from maintenance of consistency\
using collectively agreed-upon templates => reduced variability in these artifacts\
3-phase investigation in mature projects, results promising

