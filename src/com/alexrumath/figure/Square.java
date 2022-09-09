package com.alexrumath.figure;

public class Square implements IFigure {

    public final float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
