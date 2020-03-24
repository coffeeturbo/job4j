package ru.job4j.tracker.strategy;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import java.util.List;

public class ShowAllItemsActionStrategy implements UserActionStrategy {
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int size = tracker.findAll().size();
        List<Item> items = tracker.findAll();
        for (Item item: items) {
            System.out.println("positionId: " + item.getId()
                    + " PosName: " + item.getName());
        }
        return true;
    }
}
