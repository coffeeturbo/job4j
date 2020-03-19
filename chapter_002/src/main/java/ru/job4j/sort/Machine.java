package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];

        int div = money - price;
        int size = 0;
        int coin = 0;
        while (div != 0) {
            if (div < coins[coin]) {
                coin++;
            } else {
                div -= coins[coin];
                rsl[size++] = coins[coin];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
