## Impure methods that modify array arguments

- [commons-collections v4.1](https://github.com/apache/commons-collections/tree/collections-4.1)
1. __org/apache/commons/collections4/CollectionUtils.java__
  ```
  public static void reverseArray(final Object[] array) {
    int i = 0;
    int j = array.length - 1;
    Object tmp;

    while (j > i) {
      tmp = array[j];
      array[j] = array[i];
      array[i] = tmp;
      j--;
      i++;
    }
  }
  ```

- [hedwig v0.7](https://sourceforge.net/projects/hwmail/files/0.7/)
1. __com/hs/mail/security/login/CryptPasswordEncoder.java__
  ```
  private static void init_perm(long[][] perm, byte[] p, int chars_in, int chars_out) {
    for (int k=0; k < chars_out*8; k++) {
      int l = p[k] - 1;
      if (l < 0) continue;
      int i = l>>2;
      l = 1<<(l&0x03);
      for (int j=0; j < 16; j++) {
        int s = ((k&0x07)+((7-(k>>3))<<3));
        if ((j & l) != 0x00) perm[i][j] |= (1L<<s);
      }
    }
  }
  ```

- [commons-math v3.6.1](https://github.com/apache/commons-math/tree/MATH_3_6_1)
1. __org/apache/commons/math3/analysis/differentiation/DSCompiler.java__
  ```
  public void multiply(final double[] lhs, final int lhsOffset,
                       final double[] rhs, final int rhsOffset,
                       final double[] result, final int resultOffset) {
    for (int i = 0; i < multIndirection.length; ++i) {
      final int[][] mappingI = multIndirection[i];
      double r = 0;
      for (int j = 0; j < mappingI.length; ++j) {
        r += mappingI[j][0] *
             lhs[lhsOffset + mappingI[j][1]] *
             rhs[rhsOffset + mappingI[j][2]];
        }
        result[resultOffset + i] = r;
      }
  }
  ```

2. __org/apache/commons/math3/analysis/differentiation/DSCompiler.java__
  ```
  public void compose(final double[] operand, final int operandOffset, final double[] f,
                      final double[] result, final int resultOffset) {
    for (int i = 0; i < compIndirection.length; ++i) {
      final int[][] mappingI = compIndirection[i];
      double r = 0;
      for (int j = 0; j < mappingI.length; ++j) {
        final int[] mappingIJ = mappingI[j];
        double product = mappingIJ[0] * f[mappingIJ[1]];
        for (int k = 2; k < mappingIJ.length; ++k) {
          product *= operand[operandOffset + mappingIJ[k]];
        }
        r += product;
      }
      result[resultOffset + i] = r;
    }
  }
  ```

3. __org/apache/commons/math3/transform/FastFourierTransformer.java__
  ```
   private static void bitReversalShuffle2(double[] a, double[] b) {
     final int n = a.length;
     assert b.length == n;
     final int halfOfN = n >> 1;
     int j = 0;
     for (int i = 0; i < n; i++) {
       if (i < j) {
         double temp = a[i];
         a[i] = a[j];
         a[j] = temp;
         temp = b[i];
         b[i] = b[j];
         b[j] = temp;
       }
       int k = halfOfN;
       while (k <= j && k > 0) {
         j -= k;
         k >>= 1;
       }
       j += k;
     }
  }
  ```

4. __org/apache/commons/math3/geometry/euclidean/threed/Rotation.java__
  ```
  public void applyTo(final double[] in, final double[] out) {
    final double x = in[0];
    final double y = in[1];
    final double z = in[2];
    final double s = q1 * x + q2 * y + q3 * z;
    out[0] = 2 * (q0 * (x * q0 - (q2 * z - q3 * y)) + s * q1) - x;
    out[1] = 2 * (q0 * (y * q0 - (q3 * x - q1 * z)) + s * q2) - y;
    out[2] = 2 * (q0 * (z * q0 - (q1 * y - q2 * x)) + s * q3) - z;
  }
  ```

5. __org/apache/commons/math3/geometry/euclidean/threed/Rotation.java__
  ```
  public void applyInverseTo(final double[] in, final double[] out) {
    final double x = in[0];
    final double y = in[1];
    final double z = in[2];
    final double s = q1 * x + q2 * y + q3 * z;
    final double m0 = -q0;
    out[0] = 2 * (m0 * (x * m0 - (q2 * z - q3 * y)) + s * q1) - x;
    out[1] = 2 * (m0 * (y * m0 - (q3 * x - q1 * z)) + s * q2) - y;
    out[2] = 2 * (m0 * (z * m0 - (q1 * y - q2 * x)) + s * q3) - z;
  }
  ```

6. __org/apache/commons/math3/fitting/leastsquares/LevenbergMarquardtOptimizer.java__
  ```
  private void qTy(double[] y, InternalData internalData) {
    final double[][] weightedJacobian = internalData.weightedJacobian;
    final int[] permutation = internalData.permutation;
    final double[] beta = internalData.beta;
    final int nR = weightedJacobian.length;
    final int nC = weightedJacobian[0].length;
    for (int k = 0; k < nC; ++k) {
      int pk = permutation[k];
      double gamma = 0;
      for (int i = k; i < nR; ++i) {
        gamma += weightedJacobian[i][pk] * y[i];
      }
      gamma *= beta[pk];
      for (int i = k; i < nR; ++i) {
        y[i] -= gamma * weightedJacobian[i][pk];
      }
    }
  }
  ```

7. __org/apache/commons/math3/ode/nonstiff/GraggBulirschStoerIntegrator.java__
  ```
  private void extrapolate(final int offset, final int k,
                           final double[][] diag, final double[] last) {
    for (int j = 1; j < k; ++j) {
      for (int i = 0; i < last.length; ++i) {
        diag[k-j-1][i] = diag[k-j][i] +
                         coeff[k+offset][j-1] * (diag[k-j][i] - diag[k-j-1][i]);
      }
    }

    for (int i = 0; i < last.length; ++i) {
      last[i] = diag[0][i] + coeff[k+offset][k-1] * (diag[0][i] - last[i]);
    }
  }
  ```

8. __org/apache/commons/math3/util/KthSelector.java)__
  ```
  private int partition(final double[] work, final int begin, final int end, final int pivot) {
    final double value = work[pivot];
    work[pivot] = work[begin];

    int i = begin + 1;
    int j = end - 1;
    while (i < j) {
      while (i < j && work[j] > value) {
        --j;
      }
      while (i < j && work[i] < value) {
        ++i;
      }

      if (i < j) {
        final double tmp = work[i];
        work[i++] = work[j];
        work[j--] = tmp;
      }
    }

    if (i >= end || work[i] > value) {
      --i;
    }
    work[begin] = work[i];
    work[i] = value;
    return i;
  }
  ```

9. __org/apache/commons/math3/util/MathArrays.java__
  ```
  public static void scaleInPlace(double val, final double[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] *= val;
    }
  }
  ```

10. __org/apache/commons/math3/util/FastMathCalc.java__
  ```
  private static void split(final double d, final double split[]) {
    if (d < 8e298 && d > -8e298) {
      final double a = d * HEX_40000000;
      split[0] = (d + a) - a;
      split[1] = d - split[0];
    } else {
      final double a = d * 9.31322574615478515625E-10;
      split[0] = (d + a - d) * HEX_40000000;
      split[1] = d - split[0];
    }
  }
  ```

11. __org/apache/commons/math3/util/FastMathCalc.java__
  ```
  private static void resplit(final double a[]) {
    final double c = a[0] + a[1];
    final double d = -(c - a[0] - a[1]);
    if (c < 8e298 && c > -8e298) { // MAGIC NUMBER
      double z = c * HEX_40000000;
      a[0] = (c + z) - z;
      a[1] = c - a[0] + d;
    } else {
      double z = c * 9.31322574615478515625E-10;
      a[0] = (c + z - c) * HEX_40000000;
      a[1] = c - a[0] + d;
    }
  }
  ```

12. __org/apache/commons/math3/optim/nonlinear/scalar/noderiv/CMAESOptimizer.java__
  ```
  private static void push(double[] vals, double val) {
    for (int i = vals.length-1; i > 0; i--) {
      vals[i] = vals[i-1];
    }
    vals[0] = val;
  }
  ```

13. __org/apache/commons/math3/analysis/solvers/BracketingNthOrderBrentSolver.java__
  ```
  private double guessX(final double targetY, final double[] x, final double[] y,
                        final int start, final int end) {
    for (int i = start; i < end - 1; ++i) {
      final int delta = i + 1 - start;
      for (int j = end - 1; j > i; --j) {
        x[j] = (x[j] - x[j-1]) / (y[j] - y[j - delta]);
      }
    }
    double x0 = 0;
    for (int j = end - 1; j >= start; --j) {
      x0 = x[j] + x0 * (targetY - y[j]);
    }
    return x0;
  }
  ```

14. __org/apache/commons/math3/transform/TransformUtils.java__
  ```
  public static double[] scaleArray(double[] f, double d) {
    for (int i = 0; i < f.length; i++) {
      f[i] *= d;
    }
    return f;
  }
  ```

