package ru.job4j.tracker.strategy;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;

public interface UserActionStrategy {
    String name();

    boolean execute(Input input, Tracker tracker);
}
