package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void convertMatrixToList() {
        Integer[][] matrix = new Integer[][] {{1, 2, 3, }, {4, 5, 6}, {7, 8, 9}};

        List<Integer> actual = Matrix.convertMatrixToList(matrix);
        assertEquals(matrix[0][0], actual.iterator().next());
    }
}