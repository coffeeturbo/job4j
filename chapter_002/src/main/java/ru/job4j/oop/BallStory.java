package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();

        Fox lisa = new Fox();
        lisa.tryEat(kolobok);

        Hare kosoy = new Hare();
        kosoy.tryEat(kolobok);

        Wolf seriy = new Wolf();
        seriy.tryEat(kolobok);
    }
}
