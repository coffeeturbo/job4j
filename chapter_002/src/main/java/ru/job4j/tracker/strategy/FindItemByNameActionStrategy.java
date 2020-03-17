package ru.job4j.tracker.strategy;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class FindItemByNameActionStrategy implements UserActionStrategy {
    @Override
    public String name() {
        return "=== Find Item by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(name());
        String name = input.askStr("Enter name: ");

        Item[] items = tracker.findByName(name);

        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null) {
                System.out.println("positionId: " + item.getId()
                        + " PosName: " + item.getName());
            }
        }
        return true;
    }
}
