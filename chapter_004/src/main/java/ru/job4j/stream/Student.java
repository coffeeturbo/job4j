package ru.job4j.stream;

import java.util.Objects;

public class Student {

    private String surName;
    private int score;

    @Override
    public String toString() {
        return "Student{" + "score=" + score + '}';
    }

    public Student(int score) {
        this.score = score;
    }
    public Student(String surName, int score) {
        this.surName = surName;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score
                && Objects.equals(surName, student.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName, score);
    }
}
