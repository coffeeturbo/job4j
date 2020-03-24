package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add(0, "Petr");
        names.add(0, "Ivan");
        names.add(0, "Stepan");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
