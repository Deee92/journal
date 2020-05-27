## Instrumentation for saving returned expressions in a variable

### pure methods that return a value (a primitive, or an object)
1. _org/apache/commons/math3/stat/regression/RegressionResults.java_
```
  public double getErrorSumSquares() {
    return this.globalFitInfo[ SSE_IDX];
  }
```

#### post-instrumentation
```
  public double getErrorSumSquares() {
    double returnedExpression;
    returnedExpression = this.globalFitInfo[SSE_IDX];
    return returnedExpression;
  }
```

2. _org/apache/commons/math3/exception/MathIllegalStateException.java_
```
  public ExceptionContext getContext() {
    return context;
  }
```

#### post-instrumentation
```
  public ExceptionContext getContext() {
    ExceptionContext returnedExpression;
    returnedExpression = context;
    return returnedExpression;
  }
```

### pure methods that return a primitive
3. _org/apache/commons/math3/util/Decimal64.java_
```
  public int intValue() {
    return (int) value;
  }
```

#### post-instrumentation
```
  public int intValue() {
    int returnedExpression;
    returnedExpression = ((int) (value));
    return returnedExpression;
  }
```

### pure methods that do not return a primitive
4. _org/apache/commons/math3/geometry/spherical/twod/Vertex.java_
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

### post-instrumentation - TODO: fix
```
  Circle sharedCircleWith(final Vertex vertex) {
    Circle returnedExpression;
    for (final Circle circle1 : circles) {
      for (final Circle circle2 : vertex.circles) {
        if (circle1 == circle2) {
          returnedExpression = circle1;
         }
      }
    }
    returnedExpression = null;
    return returnedExpression;
  }
```

### pure methods with if statement(s)
5. _org/apache/commons/math3/stat/descriptive/moment/Variance.java_
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

#### post-instrumentation
```
  public double getResult() {
    double returnedExpression;
    if (moment.n == 0) {
      returnedExpression = Double.NaN;
    } else if (moment.n == 1) {
      returnedExpression = 0.0;
    } else if (isBiasCorrected) {
      returnedExpression = moment.m2 / (moment.n - 1.0);
    } else {
      returnedExpression = moment.m2 / moment.n;
    }
    return returnedExpression;
  }
```

### pure methods with loop(s)
6. _org/apache/commons/math3/util/MathArrays.java_
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

#### post-instrumentation
```
  public static int[] sequence(int size, int start, int stride) {
    int[] returnedExpression;
    final int[] a = new int[size];
    for (int i = 0; i < size; i++) {
      a[i] = start + (i * stride);
    }
    returnedExpression = a;
    return returnedExpression;
  }
```

7. _org/apache/commons/math3/analysis/interpolation/LoessInterpolator.java_
```
  private static int nextNonzero(final double[] weights, final int i) {
    int j = i + 1;
    while(j < weights.length && weights[j] == 0) {
      ++j;
    }
    return j;
  }
```

#### post-instrumentation
```
  private static int nextNonzero(final double[] weights, final int i) {
    int returnedExpression;
    int j = i + 1;
    while ((j < weights.length) && (weights[j] == 0)) {
      ++j;
    } 
    returnedExpression = j;
    return returnedExpression;
  }
```

### pure methods that use conditional operators
8. _org/apache/commons/math3/random/EmpiricalDistribution.java_
```
  private double pBminus(int i) {
    return i == 0 ? 0 : upperBounds[i - 1];
  }

```

#### post-instrumentation
```
  private double pBminus(int i) {
    double returnedExpression;
    returnedExpression = i == 0 ? 0 : upperBounds[i - 1];
    return returnedExpression;
  }
```

### pure methods that have parameters
9. _org/apache/commons/math3/stat/regression/SimpleRegression.java_
```
  private double getIntercept(final double slope) {
    if (hasIntercept){
      return (sumY - slope * sumX) / n;
    }
    return 0.0;
  }
```

#### post-instrumentation - TODO: fix
```
  private double getIntercept(final double slope) {
    double returnedExpression;
    if (hasIntercept) {
      returnedExpression = (sumY - (slope * sumX)) / n;
    }
    returnedExpression = 0.0;
    return returnedExpression;
  }
```

### pure methods that use switch statements
10. _org/apache/commons/math3/optim/linear/Relationship.java_
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

#### post-instrumentation - TODO: fix
```
  public Relationship oppositeRelationship() {
    Relationship returnedExpression;
    switch (this) {
      case LEQ :
           return GEQ;
      case GEQ :
           return LEQ;
      default :
           return EQ;
    }
    return returnedExpression;
  }
```

### pure methods that define local variables
11. _org/apache/commons/math3/geometry/euclidean/twod/Vector2D.java_
```
  public double distanceSq(Vector<Euclidean2D> p) {
    Vector2D p3 = (Vector2D) p;
    final double dx = p3.x - x;
    final double dy = p3.y - y;
    return dx * dx + dy * dy;
  }
```

#### post-instrumentation
```
  public double distanceSq(Vector<Euclidean2D> p) {
    double returnedExpression;
    Vector2D p3 = ((Vector2D) (p));
    final double dx = p3.x - x;
    final double dy = p3.y - y;
    returnedExpression = (dx * dx) + (dy * dy);
    return returnedExpression;
  }
```

### pure methods that have multiple statements
12. _org/apache/commons/math3/optim/nonlinear/scalar/noderiv/CMAESOptimizer.java_
```
  private static int[] inverse(final int[] indices) {
    final int[] inverse = new int[indices.length];
    for (int i = 0; i < indices.length; i++) {
      inverse[indices[i]] = i;
    }
    return inverse;
  }
```

#### post-instrumentation
```
  private static int[] inverse(final int[] indices) {
    int[] returnedExpression;
    final int[] inverse = new int[indices.length];
    for (int i = 0; i < indices.length; i++) {
      inverse[indices[i]] = i;
    }
    returnedExpression = inverse;
    return returnedExpression;
  }
```

