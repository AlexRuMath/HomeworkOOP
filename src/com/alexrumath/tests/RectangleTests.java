package com.alexrumath.tests;

import com.alexrumath.figure.Rectangle;
import com.alexrumath.figure.Square;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Theories.class)
public class RectangleTests {
    public final double delta = 1e-1;

    @DataPoint
    public static Rectangle[] testsData(){
        return new Rectangle[] {
                new Rectangle(1, 2),
                new Rectangle(3, 4),
                new Rectangle(5, 6),
                new Rectangle(7, 8),
                new Rectangle(9, 10),
        };
    }

    @Theory
    public void RectangleReturnValidAreaValue(final Rectangle[] rectangles){
        for (int i = 0; i < rectangles.length; i++) {
            double area = rectangles[i].getArea();

            assertEquals(rectangles[i].height * rectangles[i].weight, area, this.delta);
        }
    }
}
