package ru.job4j.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {
    public static Map<String, Set<String>> sections(List<Student> students) {
        Map<String, Set<String>> map = students.stream()
            .flatMap(
                student -> student.getUnits().stream()
                    .map(u -> new Group.Holder(u, student.getName())
                    )
            )
            .collect(
                Collectors.groupingBy(
                    t -> t.key,
                    Collector.of(
                        HashSet::new,
                        (set, el) -> set.add(el.value),
                        (left, right) -> {
                            left.addAll(right);
                            return left;
                        }
                    )
                )
            );

        return map;
    }


    public static class Holder {
        String key, value;

        Holder(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}


