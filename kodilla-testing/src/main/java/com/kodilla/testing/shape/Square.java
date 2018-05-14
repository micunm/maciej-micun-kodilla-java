package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private double side;

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public double getField() {
        return side*side;
    }
}
