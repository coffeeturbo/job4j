package ru.job4j.array;

public class FindLoop {
    /**
     * Находис Индекс элемента в массиве
     * @param data
     * @param el
     * @return
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    /**
     * НАходим индекс элемента в массиве в диапазоне
     * @param data
     * @param el
     * @param start
     * @param finish
     * @return
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.

        for (int i = start; i < finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }

        return rst;
    }
}
