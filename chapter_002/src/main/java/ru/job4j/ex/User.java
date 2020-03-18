package ru.job4j.ex;

import ru.job4j.ex.exception.UserInvalidException;

public class User {
    private String username;
    private boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public String getUsername() {
        return username;
    }

    public boolean isValid() throws UserInvalidException {
        if (!valid) {
            throw new UserInvalidException("пользователь не валиден");
        }

        return valid;
    }
}
