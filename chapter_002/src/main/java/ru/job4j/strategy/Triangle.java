package ru.job4j.strategy;

import java.util.StringJoiner;

public class Triangle implements Shape {
    @Override
    public String draw() {

        StringJoiner pic = new StringJoiner(System.lineSeparator())
                .add("++++++")
                .add("++  ++")
                .add("+    +")
                .add("++++++");
        return pic.toString();
    }
}
