package ru.job4j.condition;

public class Point {


    public static double distance(int x1, int y1, int x2, int y2) {

        int divX = x2 - x1;
        int divY = y2 - y1;

        int powX = (int) Math.pow(divX, 2);
        int powY = (int) Math.pow((divY), 2);

        return Math.sqrt(powX + powY);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);


        double result2 = Point.distance(0, 0, 4, 4);
        System.out.println("result (0, 0) to (4, 4) " + result2);
    }
}
