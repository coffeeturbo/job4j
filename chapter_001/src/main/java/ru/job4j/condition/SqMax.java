package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            result = first;
            if (first > third) {
                result = first;
                if (first > forth) {
                    result = first;
                } else {
                    result = forth;
                }
            } else {
                result = third;
            }
        } else if (second > third) {
            result = second;
            if (second > forth) {
                result = second;
            }
        } else if (third > forth) {

            result = third;
        }
        return result;
    }
}
