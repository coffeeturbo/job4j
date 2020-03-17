package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.strategy.CreateActionStrategy;
import ru.job4j.tracker.strategy.DeleteItemActionStrategy;
import ru.job4j.tracker.strategy.ReplaceItemActionStrategy;
import ru.job4j.tracker.strategy.UserActionStrategy;

import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void init() {

        StartUI ui = new StartUI();
        String[] answers = {"0"};
        StubInput input = new StubInput(answers);
        StubAction action = new StubAction();
        ui.init(input, new Tracker(), new UserActionStrategy[] {action});

        assertThat(action.isCall(), is(true));
    }

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix Pc"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();

        UserActionStrategy create = new CreateActionStrategy();
        create.execute(input, tracker);

        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix Pc");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {

        Tracker tracker = new Tracker();
        Item item = new Item(" Item");
        tracker.add(item);

        String[] answers = {item.getId(), "Replace Item"};
        Input input = new StubInput(answers);

        UserActionStrategy replace = new ReplaceItemActionStrategy();
        replace.execute(input, tracker);

        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("Replace Item"));
    }

    @Test
    public void whenDeleteItem() {

        Tracker tracker = new Tracker();
        Item item = new Item(" Item");
        tracker.add(item);

        String[] answers = {item.getId(), "Replace Item"};
        Input input = new StubInput(answers);

        UserActionStrategy delete = new DeleteItemActionStrategy();
        delete.execute(input, tracker);

        Item replaced = tracker.findById(item.getId());
        assertNull(replaced);
    }
}