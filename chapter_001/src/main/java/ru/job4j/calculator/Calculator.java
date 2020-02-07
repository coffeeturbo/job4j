package ru.job4j.calculator;

/**
 * The Calculator.
 * @author savuskinvaceslav
 */
public class Calculator {

    /**
     * Method add
     *
     * @param first  the first
     * @param second the second
     */
    public static void add(double first, double second) {

        double result = first + second;

        System.out.println(first+ " + " + second+ " = " + result);

    }

    /**
     * Div.
     *
     * @param first  the first
     * @param second the second
     */
    public static void div(double first, double second) {

        double result = first / second;

        System.out.println(first+ " / " + second+ " = " + result);

    }

    /**
     * Multiply.
     *
     * @param first  the first
     * @param second the second
     */
    public static void multiply(double first, double second) {

        double result = first * second;

        System.out.println(first+ " * " + second+ " = " + result);

    }

    /**
     * Subtract.
     *
     * @param first  the first
     * @param second the second
     */
    public static void subtract(double first, double second) {

        double result = first - second;

        System.out.println(first+ " - " + second+ " = " + result);

    }

    /**
     * Method main
     *
     * @param arg the input arguments
     */
    public static void main(String[] arg) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }

}
