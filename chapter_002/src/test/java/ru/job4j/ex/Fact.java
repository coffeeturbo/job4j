package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println(calc(0));
    }

    static public int calc(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("the value is less then 1");
        }

        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
