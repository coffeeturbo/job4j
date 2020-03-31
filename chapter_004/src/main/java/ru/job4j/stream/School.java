package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                                student -> student.getName(),
                                student -> student
                        )
                );

        return list;
    }

    public static List<Student> levelOf(List<Student> students, int bound) {
        List<Student> filtered = students.stream()
                .flatMap(Stream::ofNullable)
                .sorted(Comparator.naturalOrder())
                .takeWhile(student -> student.getScore() >= bound)
                .collect(Collectors.toList());
        return filtered;
    }
}
