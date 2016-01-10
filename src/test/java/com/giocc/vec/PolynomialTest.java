package com.giocc.vec;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolynomialTest {

    @Test
    public void testAdd() throws Exception {
        // Given
        final Polynomial xs = new Polynomial(new DoubleVector(new double[] {1.0, 1.0, 1.0}));
        final Polynomial ys = new Polynomial(new DoubleVector(new double[] {1.0, 1.0, 1.0}));

        // When
        final Polynomial zs = xs.add(ys);

        // Then
        assertEquals(new Polynomial(new DoubleVector(new double[] {2.0, 2.0, 2.0})), zs);
        assertEquals(2.0 * 4 * 4 + 2.0 * 4 + 2.0, zs.apply(4.0), 0.1);
    }

    @Test
    public void testMultiply() throws Exception {
        // Given
        final Polynomial xs = new Polynomial(new DoubleVector(new double[] {1.0, 1.0, 1.0}));

        // When
        final Polynomial zs = xs.multiply(2.0);

        // Then
        assertEquals(new Polynomial(new DoubleVector(new double[] {2.0, 2.0, 2.0})), zs);
        assertEquals(2.0 * 4 * 4 + 2.0 * 4 + 2.0, zs.apply(4.0), 0.1);
    }
}