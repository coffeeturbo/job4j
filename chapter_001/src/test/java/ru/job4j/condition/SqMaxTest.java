package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void whenMaxFirst() {
        SqMax check = new SqMax();
        int result = check.max(7, 6, 4, 5);

        assertThat(result, is(7));
    }

    @Test
    public void whenMaxSecond() {
        SqMax check = new SqMax();
        int result = check.max(6, 7, 4, 5);

        assertThat(result, is(7));
    }

    @Test
    public void whenMaxThid() {
        SqMax check = new SqMax();
        int result = check.max(6, 4, 7, 5);

        assertThat(result, is(7));
    }

    @Test
    public void whenMaxFourth() {
        SqMax check = new SqMax();
        int result = check.max(6, 4, 5, 7);

        assertThat(result, is(7));
    }

}