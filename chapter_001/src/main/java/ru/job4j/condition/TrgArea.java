package ru.job4j.condition;

public class TrgArea {

    private Point first, second, third;



    public static double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static double area(int x1, int y1, int x2, int y2, int x3, int y3) {

        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        Point third = new Point(x3, y3);

        double a, b, c;
        a = first.distance(second);
        b = second.distance(third);
        c = third.distance(first);

        double p = period(a, b, c);

        double area = -1;
        if (exist(a, b, c)) {
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        return area;
    }

    public static boolean exist(double ab, double ac, double bc) {

        boolean sideA = ab + ac > bc;
        boolean sideB = ab + bc > ac;
        boolean sideC = ac + bc > ab;

        return sideA && sideB && sideC;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(0, 0, 0, 3, 3, 0);
        System.out.println("area (2, 2, 2) = " + rsl);
    }

}
