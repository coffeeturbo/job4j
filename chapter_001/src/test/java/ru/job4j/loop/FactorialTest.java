package ru.job4j.loop;

import static org.hamcrest.Matchers.is;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.

        int in = 5;
        int expected = 120;
        int result = Factorial.calc(in);
        Assert.assertThat(expected, is(result));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int expected = 1;
        int result = Factorial.calc(in);
        Assert.assertThat(expected, is(result));
    }
}