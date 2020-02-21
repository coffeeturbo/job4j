package ru.job4j.condition;

public class Triangle {
    private Point first, second, third;

    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public double area() {

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
