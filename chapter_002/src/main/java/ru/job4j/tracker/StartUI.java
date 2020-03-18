package ru.job4j.tracker;

import ru.job4j.tracker.input.ConsoleInput;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.ValidateInput;
import ru.job4j.tracker.strategy.*;

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
    public void init(Input input, Tracker tracker, UserActionStrategy[] actions) {
        boolean run = true;

        while (run) {
            this.showMenu(actions);
            int select = Integer.valueOf(input.askInt("Select: ", actions.length));
            UserActionStrategy action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserActionStrategy[] actions) {
        System.out.println("Menu.");
        for (int i = 0; i < actions.length; i++) {
            System.out.println(i + " " + actions[i].name());
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Input scanner = new ValidateInput();
        Tracker tracker = new Tracker();

        UserActionStrategy[] actions = {
                new CreateActionStrategy(),
                new ShowAllItemsActionStrategy(),
                new DeleteItemActionStrategy(),
                new ReplaceItemActionStrategy(),
                new FindItemByIdActionStrategy(),
                new FindItemByNameActionStrategy(),
        };

        new StartUI().init(scanner, tracker, actions);
    }
}
