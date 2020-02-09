package ru.job4j.array;

public class Turn {

    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static int[] back(int[] array) {

        for (int i = 0; i < (int) array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }

        return array;
    }

    public static void main(String[] args) {
        back(new int[]{1, 2, 3, 4});
    }

}
