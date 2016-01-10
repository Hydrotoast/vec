package com.giocc;

import com.giocc.vec.DoubleVector;
import org.junit.Assert;
import org.junit.Test;

public class DoubleVectorTest {

    @Test
    public void testAdd() throws Exception {
        // Given
        final DoubleVector xs = new DoubleVector(new double[] {1.0, 1.0, 1.0});
        final DoubleVector ys = new DoubleVector(new double[] {1.0, 1.0, 1.0});

        // When
        final DoubleVector zs = xs.add(ys);

        // Then
        Assert.assertEquals(new DoubleVector(new double[] {2.0, 2.0, 2.0}), zs);
    }

    @Test
    public void testMultiply() throws Exception {
        // Given
        final DoubleVector xs = new DoubleVector(new double[] {1.0, 1.0, 1.0});
        final double scalar = 2.0;

        // When
        final DoubleVector zs = xs.multiply(scalar);

        // Then
        Assert.assertEquals(new DoubleVector(new double[] {2.0, 2.0, 2.0}), zs);
    }
}