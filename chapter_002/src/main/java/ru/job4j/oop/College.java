package ru.job4j.oop;

import ru.job4j.oop.object.Freshman;
import ru.job4j.oop.object.Student;

public class College {
    public static void main(String[] args) {
        Freshman person = new Freshman();
        Student std = person;
        Object obj = person;
    }
}
