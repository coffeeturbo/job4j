package ru.job4j.pojo;

public class ProductContains {
    public static void main(String[] args) {
        Product first = new Product("first", 100);
        Product second = new Product("first", 100);
        boolean eq = first == second;
        System.out.println(eq);

        eq = first.equals(second);
        System.out.println(eq);


    }
}
