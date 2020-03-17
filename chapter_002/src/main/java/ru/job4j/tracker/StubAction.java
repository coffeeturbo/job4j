package ru.job4j.tracker;

import ru.job4j.tracker.strategy.UserActionStrategy;

public class StubAction implements UserActionStrategy {
    private boolean call = false;

    @Override
    public String name() {
        return "Stub name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }
}
