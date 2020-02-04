package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void whenMax() {
        SqMax check = new SqMax();
        int result = check.max(6, 4, 7, 5);

        assertThat(result, is(7));
    }

}