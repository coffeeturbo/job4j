package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> aGroupStudends = students.stream()
                .filter(student ->  predict.test(student)
                ).collect(Collectors.toList());

        return aGroupStudends;
    }

    public static Map<String, Student> convertToMap(List<Student> students) {
        Map<String, Student> list =  students.stream()
                .distinct()
                .collect(
                        Collectors.toMap(
                                student -> student.getSurName(),
                                student -> student
                        )
                );

        return list;
    }
}
