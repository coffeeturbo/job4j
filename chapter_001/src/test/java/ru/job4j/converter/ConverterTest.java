package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rublesToEuro() {

        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);

        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {

        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);

        Assert.assertEquals(expected, out);
    }

    @Test
    public void euroToRuble() {
        int in = 3;
        int expected = 210;
        int out = Converter.euroToRuble(in);

        Assert.assertEquals(expected, out);
    }

    @Test
    public void dollorToRuble() {
        int in = 3;
        int expected = 180;
        int out = Converter.dollorToRuble(in);

        Assert.assertEquals(expected, out);
    }
}
