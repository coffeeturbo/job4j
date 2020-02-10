package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        // проверить. что массив word имеет последние элементы одинаковые с post
        for (int i = 0; i < post.length; i++) {

            char postLetter = post[i];
            char checkWord = word[word.length - post.length + i];

            result = checkWord == postLetter;
        }

        return result;
    }

}
