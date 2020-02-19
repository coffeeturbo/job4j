package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;

    }

    public static void main(String[] args) {

        DummyDic translator = new DummyDic();
        String hello = translator.engToRus("test");
        System.out.println(hello);
    }
}
