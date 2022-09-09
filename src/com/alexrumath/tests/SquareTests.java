package com.alexrumath.tests;

import com.alexrumath.figure.Circle;
import com.alexrumath.figure.Square;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Theories.class)
public class SquareTests {
    public final double delta = 1e-1;

    @DataPoint
    public static Square[] testsData(){
        return new Square[] {
                new Square(1),
                new Square(2),
                new Square(3),
                new Square(4),
                new Square(5),
        };
    }

    @Theory
    public void SquareReturnValidAreaValue(final Square[] squers){
        for (int i = 0; i < squers.length; i++) {
            double area = squers[i].getArea();

            assertEquals(squers[i].side * squers[i].side, area, this.delta);
        }
    }
}
