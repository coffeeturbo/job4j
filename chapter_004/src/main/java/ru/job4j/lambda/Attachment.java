package ru.job4j.lambda;

import java.util.Comparator;

public class Attachment implements Comparator<Attachment> {
    private String name;
    private int size;

    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "{"
                + "name='" + name + '\''
                + ", size=" + size
                + '}';
    }

    @Override
    public int compare(Attachment o1, Attachment o2) {
        return o1.getSize() - o2.getSize();
    }
}
