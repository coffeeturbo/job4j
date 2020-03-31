package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {
    public static void main(String[] args) {

        Integer[][] matrix = new Integer[2][2];
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[1][0] = 2;
        matrix[1][1] = 3;

        List<Integer> list = Arrays.stream(matrix)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
