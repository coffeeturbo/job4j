package ru.job4j.tracker;

/**
 * The type Start ui.
 */
public class StartUI {
    /**
     * Init.
     *
     * @param input the scanner
     * @param tracker the tracker
     */
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();

            int select = Integer.valueOf(input.askStr("Select: "));

            switch (select) {
                case 0:
                    StartUI.createItem(input, tracker);
                    break;
                case 1:
                    StartUI.showAllItems(tracker);
                    break;
                case 2:
                    StartUI.replaceItem(input, tracker);
                    break;
                case 3:
                    StartUI.deleteItem(input, tracker);
                    break;
                case 4:
                    StartUI.findItemById(input, tracker);
                    break;
                case 5:
                    StartUI.findItemByName(input, tracker);
                    break;
                case 6:
                default:
                    run = false;
            }
        }
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItems(Tracker tracker) {
        System.out.println("=== Show all items ====");

        int size = tracker.findAll().length;
        Item[] items = tracker.findAll();
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            System.out.println("positionId: " + item.getId()
                    + " PosName: " + item.getName());
        }

    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item by id ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Введите имя item");

        Item item = new Item(name);
        item.setId(id);

        if (tracker.replace(id, item)) {
            System.out.println("positionId: " + id + " Успешно отредактирована!");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item by id ====");
        String id = input.askStr("Enter id: ");

        if (tracker.delete(id)) {
            System.out.println("positionId: " + id + " Успешно удалена!");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find Item by name ====");
        String id = input.askStr("Enter id: ");

        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("positionId: " + item.getId()
                    + " PosName: " + item.getName());
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find Item by name ====");
        String name = input.askStr("Enter name: ");

        Item[] items = tracker.findByName(name);

        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null) {
                System.out.println("positionId: " + item.getId()
                        + " PosName: " + item.getName());
            }
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
        Input scanner = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
