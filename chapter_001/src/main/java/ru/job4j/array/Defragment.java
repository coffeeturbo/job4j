package ru.job4j.array;

/**
 * The type Defragment.
 */
public class Defragment {

    /**
     * Compress string [ ].
     *
     * @param array the array
     * @return the string [ ]
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int j = index + 1;
                while ((array[index] == null) && j < array.length) {
                    array = SwitchArray.swap(array, index, j);
                    j++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
