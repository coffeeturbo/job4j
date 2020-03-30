package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static org.junit.Assert.*;

public class SchoolTest {
    private List<Student> list = List.of(
            new Student(10),
            new Student(30),
            new Student(50),
            new Student(70),
            new Student(90),
            new Student(100)
    );
    private List<Student> listWithNames = List.of(
            new Student("Ivan", 10),
            new Student("Peter", 30),
            new Student("Aslan", 50),
            new Student("David", 70),
            new Student("Jesus", 90),
            new Student("Christian", 100)
    );

    @Test
    public void whenStudentClassA() {

        List<Student> expectlist = List.of(
                new Student(70),
                new Student(90),
                new Student(100)
        );

        Predicate<Student> predicateA = student -> student.getScore() >= 70;
        List<Student> actual = School.collect(list, predicateA);

        assertEquals(expectlist, actual);
    }

    @Test
    public void whenStudentClassB() {
        List<Student> expectlist = List.of(
                new Student(50),
                new Student(70)
        );

        Predicate<Student> predicateB = student ->
                student.getScore() >= 50
                && student.getScore() <= 70;

        List<Student> actual = School.collect(list, predicateB);

        assertEquals(expectlist, actual);
    }

    @Test
    public void whenStudentClassC() {
        List<Student> expectlist = List.of(
                new Student(10),
                new Student(30),
                new Student(50)
        );

        Predicate<Student> predicateB = student ->
                student.getScore() >= 0
                        && student.getScore() <= 50;

        List<Student> actual = School.collect(list, predicateB);

        assertEquals(expectlist, actual);
    }

    @Test
    public void whenConvertToMap() {
        Map<String, Student> actual = School.convertToMap(listWithNames);

        String key = actual.keySet().iterator().next();
        assertEquals("Jesus", key);
        assertEquals(90, actual.get(key).getScore());

    }
}