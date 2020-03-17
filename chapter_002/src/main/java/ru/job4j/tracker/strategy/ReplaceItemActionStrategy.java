package ru.job4j.tracker.strategy;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class ReplaceItemActionStrategy implements UserActionStrategy {
    @Override
    public String name() {
        return "=== Edit Item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Введите имя item");

        Item item = new Item(name);
        item.setId(id);

        if (tracker.replace(id, item)) {
            System.out.println("positionId: " + id + " Успешно отредактирована!");
        }
        return true;
    }
}
