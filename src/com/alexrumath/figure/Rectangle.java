package com.alexrumath.figure;

public class Rectangle implements IFigure {
    public final float height;
    public final float weight;

    public Rectangle(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }


    @Override
    public double getArea() {
        return this.height * this.weight;
    }
}
