package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];

        names[0] = "Senior Cartman";
        names[1] = "Eric Cartman";
        names[2] = "The Coon";
        names[3] = "Senior Eric Cartmenes";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
