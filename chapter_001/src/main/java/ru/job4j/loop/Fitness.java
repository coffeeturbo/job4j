package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;

        int ivanProgressK = 3;
        int nikProgressK = 2;

        while (ivan < nik) {

            ivan *= ivanProgressK;
            nik *= nikProgressK;

            month++;
        }

        return month;
    }

}
