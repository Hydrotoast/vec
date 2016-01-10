package com.giocc.vec;

import java.util.Arrays;

public class DoubleVector implements Vector<DoubleVector> {
    private final double[] data;

    public DoubleVector(double[] data) {
        this.data = data;
    }

    public double[] getData() {
        return data;
    }

    public int getDimension() {
        return data.length;
    }

    public DoubleVector add(DoubleVector other) {
        final double[] resultData = data.clone();
        for (int i = 0; i < other.data.length; i++) {
            resultData[i] = resultData[i] + other.data[i];
        }
        return new DoubleVector(resultData);
    }

    public DoubleVector multiply(double scalar) {
        final double[] resultData = data.clone();
        for (int i = 0; i < data.length; i++) {
            resultData[i] = resultData[i] * scalar;
        }
        return new DoubleVector(resultData);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoubleVector that = (DoubleVector) o;
        return Arrays.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }
}
