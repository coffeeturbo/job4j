package ru.job4j.lambda;


import java.util.*;

public class StringCompare {
    public static void main(String[] args) {

        String[] str = {
                "123",
                "1",
                "12",
                "1234"
        };

        List<String> list = Arrays.asList(str);

        Comparator<String> ascSort = (str1, str2) -> str2.length() - str1.length();

        list.sort(ascSort);

        for (String item: list) {
            System.out.println(item);
        }
    }
}
