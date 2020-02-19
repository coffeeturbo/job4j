package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void giveNick(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(this.name + " сьел " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Гаф");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Блек");
        black.eat("fish");
        black.show();
    }
}
