package com.alexrumath.figure;

public class Circle implements IFigure {
    public final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
