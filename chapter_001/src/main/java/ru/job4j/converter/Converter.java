package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollorToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] arg) {

        int in = 140;
        int expectedEuro = 2;

        int euro = rubleToEuro(in);
        boolean euroPassed = expectedEuro == euro;

        System.out.println("140 rubles are 2. Test result : " + euroPassed);

        int expectedDollar = 2;
        int dollar = rubleToDollar(in);
        boolean dollarPassed = dollar == expectedDollar;

        System.out.println("140 rubles are 2. Test result : " + dollarPassed);


        int expectedEuroRuble = 9800;
        int euroRuble = euroToRuble(in);
        boolean euroRublePassed = expectedEuroRuble == euroRuble;
        System.out.println("140 euro are 9800 ruble. Test result : " + euroRublePassed);


        int expectedDollarRuble = 8400;
        int dollarRuble = dollorToRuble(in);
        boolean dollarRublePassed = expectedDollarRuble == dollarRuble;
        System.out.println("140 dollar are 9800 ruble. Test result : " + dollarRublePassed);
    }
}
