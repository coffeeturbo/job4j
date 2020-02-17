package ru.job4j.array;

public class EndsWith {

    /**
     * Ends with boolean.
     *
     * @param word the word
     * @param post the post
     * @return the boolean
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            char postLetter = post[i];
            char checkWord = word[word.length - post.length + i];
            if (checkWord != postLetter) {
                result = false;
                break;
            }
        }
        return result;
    }
}
