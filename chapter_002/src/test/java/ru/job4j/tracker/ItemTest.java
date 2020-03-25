package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void compareToSort() {
        List<Item> items = Arrays.asList(
                new Item("B"),
                new Item("F"),
                new Item("D")
        );

        List<Item> expectItems = Arrays.asList(
                new Item("B"),
                new Item("D"),
                new Item("F")
        );

        Collections.sort(items);
        assertThat(items, is(expectItems));
    }

    @Test
    public void compareToSortDesc() {
        List<Item> items = Arrays.asList(
                new Item("B"),
                new Item("F"),
                new Item("D")
        );

        List<Item> expectItems = Arrays.asList(
                new Item("F"),
                new Item("D"),
                new Item("B")
        );

        Collections.sort(items, new SortByItemNameDesc());
        assertThat(items, is(expectItems));
    }

    @Test
    public void compareToSortAsc() {
        List<Item> items = Arrays.asList(
                new Item("B"),
                new Item("F"),
                new Item("D")
        );

        List<Item> expectItems = Arrays.asList(
                new Item("B"),
                new Item("D"),
                new Item("F")
        );

        Collections.sort(items, new SortByItemNameAsc());
        assertThat(items, is(expectItems));
    }
}