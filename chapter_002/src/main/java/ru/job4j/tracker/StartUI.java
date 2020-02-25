package ru.job4j.tracker;

import java.util.Scanner;

/**
 * The type Start ui.
 */
public class StartUI {
    /**
     * Init.
     *
     * @param scanner the scanner
     * @param tracker the tracker
     */
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();

            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());

            switch (select) {
                case 0:
                    this.addNewItem(scanner, tracker);
                    break;
                case 1:
                    this.showAllItems(tracker);
                    break;
                case 2:
                    this.editItem(scanner, tracker);
                    break;
                case 3:
                    this.deleteItem(scanner, tracker);
                    break;
                case 4:
                    this.findItemById(scanner, tracker);
                    break;
                case 5:
                    this.findItemByName(scanner, tracker);
                    break;
                case 6:
                default:
                    run = false;
            }
        }
    }

    private void addNewItem(Scanner scanner, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Item item = new Item(name);
        tracker.add(item);
    }

    private void showAllItems(Tracker tracker) {
        System.out.println("=== Show all items ====");

        int size = tracker.findAll().length;
        Item[] items = tracker.findAll();
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            System.out.println("positionId: " + item.getId()
                    + " PosName: " + item.getName());
        }

    }

    private void editItem(Scanner scanner, Tracker tracker) {
        System.out.println("=== Edit Item by id ====");
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        System.out.println("Введите имя item");
        String name = scanner.nextLine();

        Item item = new Item(name);
        item.setId(id);

        tracker.replace(id, item);
    }

    private void deleteItem(Scanner scanner, Tracker tracker) {
        System.out.println("=== Delete Item by id ====");
        System.out.print("Enter id: ");
        String id = scanner.nextLine();

        Item item = tracker.findById(id);

        System.out.println("positionId: " + item.getId()
                + " PosName: " + item.getName());
    }

    private void findItemById(Scanner scanner, Tracker tracker) {
        System.out.println("=== Find Item by name ====");
        System.out.print("Enter id: ");
        String id = scanner.nextLine();

        Item item = tracker.findById(id);

        System.out.println("positionId: " + item.getId()
                + " PosName: " + item.getName());

    }

    private void findItemByName(Scanner scanner, Tracker tracker) {
        System.out.println("=== Find Item by name ====");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        Item[] items = tracker.findByName(name);

        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            System.out.println("positionId: " + item.getId()
                    + " PosName: " + item.getName());
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
