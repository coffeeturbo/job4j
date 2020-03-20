package ru.job4j.ex;

import ru.job4j.ex.exception.UserInvalidException;

import java.util.Objects;

public class User {
    private String username;
    private boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, valid);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return valid == user.valid
                && Objects.equals(username, user.username);
    }
}
