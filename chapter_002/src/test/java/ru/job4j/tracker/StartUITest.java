package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix Pc"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
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

        StartUI.replaceItem(input, tracker);

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

        StartUI.deleteItem(input, tracker);

        Item replaced = tracker.findById(item.getId());
        assertNull(replaced);
    }
}