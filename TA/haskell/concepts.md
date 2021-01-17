## Lambda calculus and functional programming

- Turing machine: state-based/sequential model of computation (Turing)
- Lambda calculus: functional model of computation (Church)
- Church-Turing hypothesis: the above two can be transformed into each other and can encode any program
- Haskell B. Curry
- **pure function**: no internal state, no side effects; just takes inputs and gives outputs
  - as opposed to Turing machines, which have internal states
  - this allows parallelization, because the functions do not interfere and have no side effects
- **referential transparency**: an expression can be replaced by its value without any side effects
  - no mutation, everything is immutable
  - functions are pure - no side effects
  - functions are deterministic - same inputs to the same function always gives the same output
```
int g = 0;

int referentiallyTransparent(int x) {
  return x + 1;
}

int referentiallyOpaque(int x) {
  g++;
  return x + g;
}
```
- QuickCheck (John Hughes@Chalmers!): tests not written by hand, but generated based on rules on what the program should do 
- input(s) => function => output
- **higher-order function**: at least the input is a function or an output is a function
- lambda calculus: basis for functional programming, included in most languages
- boolean logic => computer science :: lambda calculus => functional programming
- variables, lambda expression, application
- functions expressed as a lambda expression
- `\(head).(body)` => \ denotes lambda, head has the parameters, body is the function body
- order of arguments/parameters is important
- eg. `\x.x+1` => `(\x.x+1) 5 => 6`
- eg. `\xy.x+y` => `\x.(\y.x+y)`
- eg. `\a.a`, `\3.3`: pass 3 as parameter and get 3 back
- eg. `\a.z`, `\3.100`: pass anything as parameter and always get back 100
- eg. `(\a.az)b => bz`: `(\a.a)3` becomes `\3.3`, becomes 3
- lambda expressions applied to other lambda expressions: lambda calculus

```
(\a.ab)(\x.xx) // a returns ab, x returns xx, seond lambda is parameter, replaces a
(\(\x.xx).(\x.xx)b) // second lambda is parameter
(\(x.xx)b)
(\(b.bb))
bb
```

- **alpha equivalence**: parameters bind variables of the same name in function body: `\a.aa = \b.bb` (here a renamed to b, so the expressions are equivalent)
- body may have free variables (appear in body but not in head): `\a.z`
- `\a.az != \a.ay = \b.by` (here z != y, but a <=> b)
- alpha equivalence does not apply to free variables
- **beta reduction**: simplifying expressions through function application
- apply outermost and leftmost reducible first
- lambda expressions may have lambdas in their body

```
\a.(\b.abz) q r // evaluate first lambda, q is parameter, replaces a 
(\b.qbz) r // r is parameter, replaces b
qrz
```

- lambda expressions can only have only parameter
- break down functions taking multiple parameters 
- `\ab.abz` equivalent to `\a.(\b.abz)` **CURRYING**
- currying: transforming function taking in multiple arguments into sequence of functions that each take a single argument

```
\ab.abba
\a.(\b.abba)

AND

\abcde.~~~ => \a.(\b.(\c.(\d.(\e.(~~~~)))))
```

- Divergent expressions: never get simplified to state where nothing can be applied
```
(\x.xx)(\x.xx)
(\(\x.xx).(\x.xx)(\x.xx))
(\x.xx)(\x.xx)
```
- **Combinators**: lambda expression with no free variables; useful for putting things in the order we need; Examples:
```
\abc.cba // just reorganizes parameters, does nothing else
\xy.xx
\xy.x
\xy.yx
```

- Order of arguments is important
```
(\ab.aqbr) c d // c replaces a. d replaces b
becomes cqdr

=> (\a(\b.aqbr)) c d
=> \b.cqbr d
=> cqdr

AND

(\ab.aqbr) d c // d replaces a, c replaces b
becomes dqcr

=> (\a.(\b.aqbr)) d c
=> (\b.dqbr) c
=> dqcr
```

- Y-combinator: recursion in functional programming; self-application
`Y = \f.(\x.f(xx))(\x.f(xx))`


### Haskell
- functional
- pure
- lazy
- statically typed
- abstraction through parametric polymorphism, higher order functions, type classes

### Evaluation strategy
- determine: 1) when to evaluate arguments of function call, 2) what kind of value to pass to a function
- specified by programming language definition; Java: call by value; Haskell: call by need
- Disadvantage: reasoning about time and space usage is complicated
#### Resources:
- [Model of computation](https://en.wikipedia.org/wiki/Model_of_computation)
- [A Tutorial Introduction to the Lambda Calculus](https://personal.utdallas.edu/~gupta/courses/apl/lambda.pdf)
- [Functional programming & Haskell](https://www.youtube.com/watch?v=LnX3B9oaKzw&ab_channel=Computerphile)
- [Lamba calculus - Computerphile](https://www.youtube.com/watch?v=eis11j_iGMs&ab_channel=Computerphile)
- [School of Haskell - Haskell Basics](https://www.schoolofhaskell.com/school/starting-with-haskell/introduction-to-haskell/1-haskell-basics)

