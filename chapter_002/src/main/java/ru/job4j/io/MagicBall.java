package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        int answer = new Random().nextInt(3);

        String answerText;
        switch (answer) {
            case 0:
                answerText = "Да";
                break;
            case 1:
                answerText = "Нет";
                break;
            default: answerText = "Может";
        }

        System.out.println(question);
        System.out.println(answerText);

    }
}
