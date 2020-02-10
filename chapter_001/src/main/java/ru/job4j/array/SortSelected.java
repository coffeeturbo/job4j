package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {

        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int minInex = FindLoop.indexOf(data, min, i, data.length);

            SwitchArray.swap(data, i, minInex);
        }

        return data;
    }
}
