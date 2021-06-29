package com.kizhyk.service.util;

import com.kizhyk.bean.UserEntity;
import com.kizhyk.service.exception.ServiceIllegalArgumentException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final Validator instance = new Validator();
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private final Pattern pattern = Pattern.compile(EMAIL_REGEX);
    private static final String PASSWORD_ALLOWED_CHARACTER = "a-zA-Z0-9~`!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";

    private Validator() {
    }

    public static Validator getInstance() {
        return instance;
    }

    private void validateEmail(String email) throws ServiceIllegalArgumentException {
        Matcher m = pattern.matcher(email);
        if (!m.matches()) {
            throw new ServiceIllegalArgumentException();
        }
    }

    private void validateLogin(String login) throws ServiceIllegalArgumentException {

    }

    private void validatePassword(String password) throws ServiceIllegalArgumentException {
        if (password == null || password.isEmpty()) {
            throw new ServiceIllegalArgumentException();
        }

        if (password.length() < 4 || password.length() > 20) {
            throw new ServiceIllegalArgumentException();
        }

        if (!password.matches(String.format("[%s]+", PASSWORD_ALLOWED_CHARACTER))) {
            throw new ServiceIllegalArgumentException();
        }
    }

    public void validateUser(UserEntity user) throws ServiceIllegalArgumentException {
        if (user == null) {
            throw new ServiceIllegalArgumentException();
        }
        validateLogin(user.getLogin());
        validateEmail(user.getEmail());
        validatePassword(user.getPassword());
    }
}
