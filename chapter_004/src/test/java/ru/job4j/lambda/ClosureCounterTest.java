package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class ClosureCounterTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = ClosureCounter.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List<Double> result = ClosureCounter.diapason(1, 3, x -> Math.pow(x, 2) - 1);
        List<Double> expected = Arrays.asList(0D, 3D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmFunctionThenLogarithmResults() {
        List<Double> result = ClosureCounter.diapason(10, 13, Math::log);
        List<Double> expected = Arrays.asList(2D, 2D, 2D);
        assertThat(result, is(expected));
    }
}