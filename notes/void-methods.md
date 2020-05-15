## Pure methods that don't return a value

- [commons-collections v4.1](https://github.com/apache/commons-collections/tree/collections-4.1)
1. __org/apache/commons/collections4/CollectionUtils.java__
  ```
  /**
   * Reverses the order of the given array.
   *
   * @param array the array to reverse
   */
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
  /**
   * Initializes the given permutation table with the mapping table.
   */
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
  /** Perform multiplication of two derivative structures.
   * @param lhs array holding left hand side of multiplication
   * @param lhsOffset offset of the left hand side in its array
   * @param rhs array right hand side of multiplication
   * @param rhsOffset offset of the right hand side in its array
   * @param result array where result must be stored (for
   * multiplication the result array <em>cannot</em> be one of
   * the input arrays)
   * @param resultOffset offset of the result in its array
   */
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
  /** Compute composition of a derivative structure by a function.
   * @param operand array holding the operand
   * @param operandOffset offset of the operand in its array
   * @param f array of value and derivatives of the function at
   * the current point (i.e. at {@code operand[operandOffset]}).
   * @param result array where result must be stored (for
   * composition the result array <em>cannot</em> be the input
   * array)
   * @param resultOffset offset of the result in its array
   */
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
  /**
   * Performs identical index bit reversal shuffles on two arrays of identical
   * size. Each element in the array is swapped with another element based on
   * the bit-reversal of the index. For example, in an array with length 16,
   * item at binary index 0011 (decimal 3) would be swapped with the item at
   * binary index 1100 (decimal 12).
   *
   * @param a the first array to be shuffled
   * @param b the second array to be shuffled
   */
   private static void bitReversalShuffle2(double[] a, double[] b) {
     final int n = a.length;
     assert b.length == n;
     final int halfOfN = n >> 1;
     int j = 0;
     for (int i = 0; i < n; i++) {
       if (i < j) {
         // swap indices i & j
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
  /** Apply the rotation to a vector stored in an array.
   * @param in an array with three items which stores vector to rotate
   * @param out an array with three items to put result to (it can be the same
   * array as in)
   */
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
  /** Apply the inverse of the rotation to a vector stored in an array.
   * @param in an array with three items which stores vector to rotate
   * @param out an array with three items to put result to (it can be the same
   * array as in)
   */
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
  /**
   * Compute the product Qt.y for some Q.R. decomposition.
   *
   * @param y vector to multiply (will be overwritten with the result)
   * @param internalData Data.
   */
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
  /** Extrapolate a vector.
   * @param offset offset to use in the coefficients table
   * @param k index of the last updated point
   * @param diag working diagonal of the Aitken-Neville's
   * triangle, without the last element
   * @param last last element
   */
  private void extrapolate(final int offset, final int k,
                           final double[][] diag, final double[] last) {
    // update the diagonal
    for (int j = 1; j < k; ++j) {
      for (int i = 0; i < last.length; ++i) {
        // Aitken-Neville's recursive formula
        diag[k-j-1][i] = diag[k-j][i] +
                         coeff[k+offset][j-1] * (diag[k-j][i] - diag[k-j-1][i]);
      }
    }

    // update the last element
    for (int i = 0; i < last.length; ++i) {
      // Aitken-Neville's recursive formula
      last[i] = diag[0][i] + coeff[k+offset][k-1] * (diag[0][i] - last[i]);
    }
  }
  ```

8. __org/apache/commons/math3/linear/SingularValueDecomposition#getCovariance(double)]#visit(int,int,double)__
  ```
  public void visit(final int row, final int column,
                    final double value) {
    data[row][column] = value / singularValues[row];
  }
  ```

9. __org/apache/commons/math3/util/MathArrays.java__
  ```
  /**
   * <p>Multiply each element of an array by a value.</p>
   *
   * <p>The array is modified in place (no copy is created).</p>
   *
   * @param arr Array to scale
   * @param val Scalar
   * @since 3.2
   */
  public static void scaleInPlace(double val, final double[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] *= val;
    }
  }
  ```

10. __org/apache/commons/math3/util/FastMathCalc.java__
  ```
  /** Compute split[0], split[1] such that their sum is equal to d,
   * and split[0] has its 30 least significant bits as zero.
   * @param d number to split
   * @param split placeholder where to place the result
   */
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
  /** Recompute a split.
   * @param a input/out array containing the split, changed
   * on output
   */
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
  /**
   * Pushes the current best fitness value in a history queue.
   *
   * @param vals History queue.
   * @param val Current best fitness value.
   */
  private static void push(double[] vals, double val) {
    for (int i = vals.length-1; i > 0; i--) {
      vals[i] = vals[i-1];
    }
    vals[0] = val;
  }
  ```

