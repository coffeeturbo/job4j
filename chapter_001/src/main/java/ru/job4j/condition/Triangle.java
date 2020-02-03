package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {

        boolean sideA = ab + ac > bc;
        boolean sideB = ab + bc > ac;
        boolean sideC = ac + bc > ab;

        return sideA && sideB && sideC;
    }
}
