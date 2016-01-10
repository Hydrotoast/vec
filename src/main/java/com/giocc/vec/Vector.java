package com.giocc.vec;

/**
 * A vector interface that satisfies the properties of vector addition and scalar multiplication.
 *
 * @param <E> A subtype of {@code Vector<E>} that will be considered a vector
 */
public interface Vector<E extends Vector<E>> {
    E add(E other);

    E multiply(double scalar);

    default E subtract(E otherVector) {
        return add(otherVector.multiply(-1.0));
    }

    default E additiveInverse() {
        return multiply(-1.0);
    }
}
