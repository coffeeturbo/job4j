package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {
        int year = 0;

        double percentK = ((percent / 100) + 1);

        while (amount > 0) {
            double debet = amount * percentK;
            amount = (int) debet - salary;
            year++;
        }

        return year;
    }
}
