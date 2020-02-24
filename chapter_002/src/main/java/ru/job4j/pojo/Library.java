package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 220);
        Book book2 = new Book("The Hobbit", 2200);
        Book book3 = new Book("The Lord of the rings", 200);
        Book book4 = new Book("Pulp Fiction", 2900);

        Book[] books = new Book[4];

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " " + book.getPages());
        }

        System.out.println("---------------------");
        System.out.println("Меняем местами книги");
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " " + book.getPages());
        }

        System.out.println("---------------------");
        System.out.println("Выводим только clean code");

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean Code")) {
                System.out.println(book.getName() + " " + book.getPages());
            }
        }
    }
}
