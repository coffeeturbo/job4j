package ru.job4j.lambda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;

public class GroupTest {

    private List<Student> students;

    @Before
    public void initStudends() {
        Set<String> ivanSections = Stream.of("sport", "music", "Art").collect(Collectors.toSet());
        Set<String> nicolaSections = Stream.of("sport", "music").collect(Collectors.toSet());
        Set<String> dmitrySections = Stream.of("art").collect(Collectors.toSet());


        this.students = Stream.of(
            new Student("Ivan", ivanSections),
            new Student("Nicol", nicolaSections),
            new Student("Dima", dmitrySections),
            new Student("Dima", dmitrySections)
        ).collect(Collectors.toList());
    }

    @Test
    public void sections() {
        Map<String, Set<String>> expect = Map.of("art",
            Set.of("Dima"),
            "Art",
            Set.of("Ivan"),
            "music",
            Set.of("Ivan", "Nicol"),
            "sport",
            Set.of("Ivan", "Nicol")
        );
        var actual = Group.sections(students);

        Assert.assertThat(expect, is(actual));
    }
}