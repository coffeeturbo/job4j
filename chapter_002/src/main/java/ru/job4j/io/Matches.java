package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    private int matches = 11;

    private int user = 1;

    public int getUser() {
        return user;
    }

    public void switchUser() {
        this.user = this.user == 1 ? 2 : 1;
    }

    public int getMatches() {
        return matches;
    }

    public boolean decreaseMatches(int matches) {
        boolean result = false;
        if (matches <= 3) {
            this.matches = this.matches - matches;
            result = true;
        } else {
            System.out.println("нельзя вытащить больше 3 спичек за раз");
        }
        return result;
    }

    public static void main(String[] args) {

        Matches matches = new Matches();

        while (matches.getMatches() > 0) {
            System.out.println("Сколько спичек вы заберете");

            Scanner input = new Scanner(System.in);
            int select = Integer.valueOf(input.nextLine());

            if (!matches.decreaseMatches(select)) {
                continue;
            }

            System.out.println("Пользователь " + matches.getUser()
                    + " вытащил " + select + " спичек");

            if (matches.getMatches() <= 0) {
                System.out.println("Пользователь " + matches.getUser() + " выиграл");
                break;
            } else {
                System.out.println("В колоде осталось " + matches.getMatches() + " Спичек");
                matches.switchUser();
            }
        }
    }
}
