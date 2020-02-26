package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * The type Tracker.
 */
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
        return Arrays.copyOf(items, position);
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
     * Replace boolean.
     *
     * @param id   the id
     * @param item the item
     * @return the boolean
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);

        if (index >= 0) {
            items[index] = item;
            item.setId(id);
            result = true;
        }

        return result;
    }

    /**
     * Delete boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean delete(String id) {
        boolean result = false;
        int index = indexOf(id);
        if (index >= 0) {
            items[index] = null;
            position--;
            System.arraycopy(items, index + 1, items, index, position - index);
            result = true;
        }
        return result;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
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
