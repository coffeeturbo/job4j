package ru.job4j.tracker;

import ru.job4j.tracker.input.ConsoleInput;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.ValidateInput;
import ru.job4j.tracker.strategy.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public void init(Input input, Tracker tracker, List<UserActionStrategy> actions) {
        boolean run = true;

        while (run) {
            this.showMenu(actions);
            int select = Integer.valueOf(input.askInt("Select: ", actions.size()));
            UserActionStrategy action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserActionStrategy> actions) {
        System.out.println("Menu.");
        for (UserActionStrategy action: actions) {
            System.out.println(actions.indexOf(action) + " " + action.name());
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input scanner = new ValidateInput(input);
        Tracker tracker = new Tracker();

        List<UserActionStrategy> actionsList =  Arrays.asList(
                new CreateActionStrategy(),
                new ShowAllItemsActionStrategy(),
                new DeleteItemActionStrategy(),
                new ReplaceItemActionStrategy(),
                new FindItemByIdActionStrategy(),
                new FindItemByNameActionStrategy()
        );

        new StartUI().init(scanner, tracker, actionsList);
    }
}
