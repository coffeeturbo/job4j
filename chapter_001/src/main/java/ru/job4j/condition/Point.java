package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        int divX = this.x - that.x;
        int divY = this.y - that.y;

        int powX = (int) Math.pow(divX, 2);
        int powY = (int) Math.pow((divY), 2);

        return Math.sqrt(powX + powY);
    }

    public static void main(String[] args) {

        Point start = new Point(0, 0);
        Point endFirst = new Point(2, 0);
        Point endSecond = new Point(4, 4);

        double result = start.distance(endFirst);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result2 = start.distance(endSecond);
        System.out.println("result (0, 0) to (4, 4) " + result2);
    }
}
