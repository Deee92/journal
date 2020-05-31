
## Comparison of pankti results

All applications have
- methods that are public, private, protected, abstract, or static
- methods that throw exeptions
- methods that invoke other methods
- methods that call constructors
- methods that assign to fields

### All methods

\# | application | processing time (avg of 5, ms) | synchronized | empty | deprecated | annotation types | modiying array args | LOC (*.java) | #MAVEN_MODULES | #METH | #PURE
-- | ----------- | ------------------------------ | ------------ | ----- | ---------- | ---------------- | ------------------- | ------------ | -------------- | ----- | -----
1 | [commons-math v3.6.1][1] | 1428 | 140 | 27 | 671 | 0 | 14 | 37.4k | 0 | 6542 | 980
2 | [commons-collections v4.1][2] | 587 | 12 | 6 | 56 | 0 | 1 | 117.6k | 0 | 2730 | 277
3 | [commons-cli v1.4][3] | 226 | 0 | 0 | 43 | 0 | 0 | 11.6k | 0 | 220 | 37
4 | [ttorrent v2.0][4] | 281 | 24 | 20 | 14 | 0 | 0 | 20.8k | 8 | 856 | 172
5 | [jitsi-videobridge v2.1][5] | 340 | 15 | 19 | 0 | 2 | 0 | 34.3k | 0 | 893 | 105
6 | [hedwig v0.7][6] | 481 | 4 | 5 | 0 | 0 | 1 | 49.6k | 5 | 2108 | 385
7 | [apache-maven v3.6.3][7] | 771 | 10 | 134 | 341 | 0 | 0 | 136.3k | 14 | 4726 | 786
8 | [hibernate-tools v5.4.16][8] | 438 | 0 | 9 | 0 | 0 | 1 | 39.4k | 3 | 1407 | 228
9 | [eclipse/che v7.13.1][9] | 1025 | 38 | 78 | 4 | 36 | 0 | 262.7k | 7 | 9009 | 854
10 | [commons-lang v3.10][10] | 500 | 18 | 3 | 422 | 0 | 0 | 148.6k | 0 | 2782 | 275
___

### Pure methods

\# | application | %PURE | return a primitive | return an object | ifs | loops | conditional operators | parameters | switch statements | local variables | multiple statements
-- | ----------- | ----- | ------------------ | ---------------- | --- | ----- | --------------------- | ---------- | ----------------- | --------------- | -------------------
1 | [commons-math v3.6.1][1] | 14.9% (980 / 6542) | 609 | 371 | 40 | 27 | 30 | 139 | 1 | 53 | 64
2 | [commons-collections v4.1][2] | 10% (277 / 2730) | 115 | 162 | 10 | 2 | 11 | 42 | 0 | 2 | 10
3 | [commons-cli v1.4][3] | 16.8% (37 / 220) | 13 | 24 | 0 | 0 | 1 | 2 | 1 | 0 | 1
4 | [ttorrent v2.0][4] | 20% (172 / 856) | 86 | 86 | 1 | 0 | 1 | 8 | 0 | 2 | 2
5 | [jitsi-videobridge v2.1][5] | 11.7% (105 / 893) | 48 | 57 | 4 | 0 | 4 | 16 | 1 | 2 | 4
6 | [hedwig v0.7][6] | 18.2% (385 / 2108) | 157 | 228 | 2 | 3 | 0 | 24 | 1 | 5 | 5
7 | [apache-maven v3.6.3][7] | 16.6% (786 / 4726) | 170 | 616 | 2 | 0 | 14 | 44 | 0 | 0 | 0 
8 | [hibernate-tools v5.4.16][8] | 16.2% ( 228 / 1407) | 49 | 179 | 3 | 0 | 3 | 67 | 0 | 1 | 2
9 | [eclipse/che v7.13.1][9] | 0.09% (854 / 9009) | 115 | 739 | 8 | 3 | 4 | 49 | 4 | 7 | 10
10 | [commons-lang v3.10][10] | 0.1% (275 / 2782) | 163 | 112 | 28 | 13 | 18 | 84 | 0 | 16 | 29
___

### Pure method examples - [commons-math v3.6.1][1]

- pure methods that return a value (a primitive, or an object)\
_org/apache/commons/math3/stat/regression/RegressionResults.java_
```
  public double getErrorSumSquares() {
    return this.globalFitInfo[ SSE_IDX];
  }
```
_org/apache/commons/math3/exception/MathIllegalStateException.java_
```
  public ExceptionContext getContext() {
    return context;
  }
```

- pure methods that return a primitive\
_org/apache/commons/math3/util/Decimal64.java_
```
  public int intValue() {
    return (int) value;
  }
```

- pure methods that do not return a primitive\
_org/apache/commons/math3/geometry/spherical/twod/Vertex.java_
```
  Circle sharedCircleWith(final Vertex vertex) {
    for (final Circle circle1 : circles) {
      for (final Circle circle2 : vertex.circles) {
        if (circle1 == circle2) {
          return circle1;
        }
      }
    }
    return null;
  }

```

- pure methods with if statement(s)\
_org/apache/commons/math3/stat/descriptive/moment/Variance.java_
```
  public double getResult() {
    if (moment.n == 0) {
      return Double.NaN;
    } else if (moment.n == 1) {
      return 0d;
    } else {
      if (isBiasCorrected) {
        return moment.m2 / (moment.n - 1d);
      } else {
        return moment.m2 / (moment.n);
      }
    }
  }
```

- pure methods with loop(s)\
_org/apache/commons/math3/util/MathArrays.java_
```
  public static int[] sequence(int size,
                               int start,
                               int stride) {
    final int[] a = new int[size];
    for (int i = 0; i < size; i++) {
      a[i] = start + i * stride;
    }
    return a;
  }
```

_org/apache/commons/math3/analysis/interpolation/LoessInterpolator.java_
```
  private static int nextNonzero(final double[] weights, final int i) {
    int j = i + 1;
    while(j < weights.length && weights[j] == 0) {
      ++j;
    }
    return j;
  }
```

- pure methods that use conditional operators\
_org/apache/commons/math3/random/EmpiricalDistribution.java_
```
  private double pBminus(int i) {
    return i == 0 ? 0 : upperBounds[i - 1];
  }

```

- pure methods that have parameters\
_org/apache/commons/math3/stat/regression/SimpleRegression.java_
```
  private double getIntercept(final double slope) {
    if (hasIntercept){
      return (sumY - slope * sumX) / n;
    }
    return 0.0;
  }
```

- pure methods that use switch statements\
_org/apache/commons/math3/optim/linear/Relationship.java_
```
  public Relationship oppositeRelationship() {
    switch (this) {
      case LEQ :
        return GEQ;
      case GEQ :
        return LEQ;
      default :
        return EQ;
    }
  }
```

- pure methods that define local variables\
_org/apache/commons/math3/geometry/euclidean/twod/Vector2D.java_
```
  public double distanceSq(Vector<Euclidean2D> p) {
    Vector2D p3 = (Vector2D) p;
    final double dx = p3.x - x;
    final double dy = p3.y - y;
    return dx * dx + dy * dy;
  }
```

- pure methods that have multiple statements\
_org/apache/commons/math3/optim/nonlinear/scalar/noderiv/CMAESOptimizer.java_
```
  private static int[] inverse(final int[] indices) {
    final int[] inverse = new int[indices.length];
    for (int i = 0; i < indices.length; i++) {
      inverse[indices[i]] = i;
    }
    return inverse;
  }
```

[1]: https://github.com/apache/commons-math/tree/MATH_3_6_1
[2]: https://github.com/apache/commons-collections/tree/collections-4.1
[3]: https://github.com/apache/commons-cli/tree/cli-1.4
[4]: https://github.com/mpetazzoni/ttorrent/tree/ttorrent-2.0
[5]: https://github.com/jitsi/jitsi-videobridge/tree/v2.1
[6]: https://sourceforge.net/projects/hwmail/files/0.7/
[7]: https://github.com/apache/maven/tree/maven-3.6.3
[8]: https://github.com/hibernate/hibernate-tools/tree/5.4.16.Final
[9]: https://github.com/eclipse/che/tree/7.13.1
[10]: https://github.com/apache/commons-lang/tree/rel/commons-lang-3.10

