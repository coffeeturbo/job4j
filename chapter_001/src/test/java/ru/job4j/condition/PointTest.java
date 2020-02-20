package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {

        Point start = new Point(0, 0);
        Point end = new Point(2, 2);

        double expected = 2.82;

        double out = start.distance(end);

        Assert.assertEquals(expected, out, 0.01);
    }
}
