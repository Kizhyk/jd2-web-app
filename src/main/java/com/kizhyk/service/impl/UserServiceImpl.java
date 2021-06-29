package com.kizhyk.service.impl;

import com.kizhyk.service.UserService;
import com.kizhyk.bean.UserEntity;
import com.kizhyk.service.exception.ServiceIllegalArgumentException;
import com.kizhyk.service.util.Validator;

public class UserServiceImpl implements UserService {

    @Override
    public void signIn(String login, String password) {
    }

    @Override
    public void signUp(String login, String email, String password) throws ServiceIllegalArgumentException {
        try {
            UserEntity user = new UserEntity(login, email, password);
            Validator.validateUser(user);
            System.out.println(user);
        } catch (IllegalArgumentException e) {
            throw new ServiceIllegalArgumentException("Incorrect user's data", e);
        }
    }
}
