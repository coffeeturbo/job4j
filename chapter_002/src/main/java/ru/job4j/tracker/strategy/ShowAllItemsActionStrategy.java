package ru.job4j.tracker.strategy;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class ShowAllItemsActionStrategy implements UserActionStrategy {
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int size = tracker.findAll().length;
        Item[] items = tracker.findAll();
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            System.out.println("positionId: " + item.getId()
                    + " PosName: " + item.getName());
        }
        return true;
    }
}
