package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    /**
     * Add item.
     *
     * @param item the item
     * @return the item
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }


    /**
     * Find all item [ ].
     *
     * @return the item [ ]
     */
    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item != null) {
                itemsWithoutNull[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, size);
    }

    /**
     * Find by name item [ ].
     *
     * @param key the key
     * @return the item [ ]
     */
    public Item[] findByName(String key) {
        int size = 0;
        Item[] itemsByNames = new Item[position];
        for (int i = 0; i < position; i++) {
            if (items[i].getName().equals(key)) {
                itemsByNames[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(itemsByNames, size);
    }


    /**
     * Find by id item.
     *
     * @param id the id
     * @return the item
     */
    public Item findById(String id) {
        Item item = null;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                item = items[i];
            }
        }
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}
