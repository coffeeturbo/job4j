package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> aGroupStudends = students.stream()
                .filter(student ->  predict.test(student)
                ).collect(Collectors.toList());

        return aGroupStudends;
    }
}
