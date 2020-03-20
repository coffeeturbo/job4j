package ru.job4j.ex;

import ru.job4j.ex.exception.UserInvalidException;
import ru.job4j.ex.exception.UserNotFoundException;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (int i = 0; i < users.length; i++) {

           if (users[i].getUsername().equals(login)) {
                user = users[i];
           }
        }

        if (user == null) {
            throw new UserNotFoundException("Пользователь не найден");
        }

        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {

        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Имя слишком короткое");
        }

        return true;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true),
                    new User("Pe", true)
            };
            User user = null;
            user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }

            User user2 = findUser(users, "Pe");
            if (validate(user2)) {
                System.out.println("This user has an access");
            }

        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
