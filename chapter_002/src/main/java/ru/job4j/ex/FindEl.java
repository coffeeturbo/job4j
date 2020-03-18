package ru.job4j.ex;

public class FindEl {
    public static void main(String[] args) {
        try {
            int index = indexOf(new String[] {"стог", "игла"}, "не игла");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;

        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }

        if (rsl == -1) {
            throw new ElementNotFoundException("Элемент [" + key + "] не найден");
        }

        return rsl;
    }
}
