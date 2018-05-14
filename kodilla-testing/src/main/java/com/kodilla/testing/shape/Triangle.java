package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base=base;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }
    public double getField() {
        return 0.5*height*base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.height, height) == 0 &&
                Double.compare(triangle.base, base) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(height, base);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
