package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {

    @Test
    public void convertMatrixToList() {
        Integer[][] matrix = new Integer[][] {{1, 2, 3, }, {4, 5, 6}, {7, 8, 9}};
        List<Integer> expected = new ArrayList();
        for (int i = 1; i < 10; i++) {
            expected.add(i);
        }

        List<Integer> actual = Matrix.convertMatrixToList(matrix);
        assertThat(expected, is(actual));
    }
}