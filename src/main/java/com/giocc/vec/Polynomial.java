package com.giocc.vec;

import java.util.function.Function;

public class Polynomial implements Function<Double, Double>, Vector<Polynomial> {
    private final DoubleVector coefficients;

    public Polynomial(DoubleVector coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public Double apply(Double x) {
        final double[] coefficientsData = this.coefficients.getData();
        double result = coefficientsData[0];
        for (int i = 1; i < coefficientsData.length; i++) {
            result += coefficientsData[i] * Math.pow(x, i);
        }
        return result;
    }

    @Override
    public Polynomial add(Polynomial other) {
        return new Polynomial(coefficients.add(other.coefficients));
    }

    @Override
    public Polynomial multiply(double scalar) {
        return new Polynomial(coefficients.multiply(scalar));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Polynomial that = (Polynomial) o;
        return coefficients != null ? coefficients.equals(that.coefficients) : that.coefficients == null;
    }

    @Override
    public int hashCode() {
        return coefficients != null ? coefficients.hashCode() : 0;
    }
}
