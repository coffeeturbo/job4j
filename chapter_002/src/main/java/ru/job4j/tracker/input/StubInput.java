package ru.job4j.tracker.input;

public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    @Override
    public int askInt(String question, int max) {
        return askInt(question);
    }

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}