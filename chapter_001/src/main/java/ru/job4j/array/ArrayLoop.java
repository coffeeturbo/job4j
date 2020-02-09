package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] arg) {
        int[] numbers = new int[5];

        for(int i =0; i < numbers.length; i++) {
            numbers[i] = i*2+1;
        }

        for(int i =0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
