package ru.job4j.condition;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        int divX = this.x - that.x;
        int divY = this.y - that.y;

        int powX = (int) Math.pow(divX, 2);
        int powY = (int) Math.pow((divY), 2);

        return Math.sqrt(powX + powY);
    }


    public double distance3d(Point that) {
        int divX = this.x - that.x;
        int divY = this.y - that.y;
        int divZ = this.z - that.z;

        int powX = (int) Math.pow(divX, 2);
        int powY = (int) Math.pow((divY), 2);
        int powZ = (int) Math.pow((divZ), 2);

        return Math.sqrt(powX + powY + powZ);
    }

    public static void main(String[] args) {

        Point start = new Point(0, 0);
        Point endFirst = new Point(2, 0);
        Point endSecond = new Point(4, 4);
        Point start3d = new Point(0, 0, 0);
        Point end3d = new Point(2, 0, 2);

        double result = start.distance(endFirst);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result2 = start.distance(endSecond);
        System.out.println("result (0, 0) to (4, 4) " + result2);

        double result3d = start3d.distance3d(end3d);
        System.out.println("result 3d" + result3d);


    }
}
