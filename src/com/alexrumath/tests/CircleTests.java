package com.alexrumath.tests;

import com.alexrumath.figure.Circle;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Theories.class)
public class CircleTests {
    public final double delta = 1e-1;

    @DataPoint
    public static Circle[] testsData(){
        return new Circle[] {
                new Circle(1),
                new Circle(2),
                new Circle(3),
                new Circle(4),
                new Circle(5),
        };
    }

    @Theory
    public void CircleReturnValidAreaValue(final Circle[] circles){
        for (int i = 0; i < circles.length; i++) {
            double area = circles[i].getArea();

            assertEquals(Math.PI * circles[i].radius * circles[i].radius, area, this.delta);
        }
    }
}
