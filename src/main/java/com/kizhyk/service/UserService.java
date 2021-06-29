package com.kizhyk.service;

import com.kizhyk.bean.UserEntity;
import com.kizhyk.service.exception.ServiceIllegalArgumentException;

public interface UserService {
    public void signIn(String login, String password);
    public void signUp(String login, String email, String password) throws ServiceIllegalArgumentException;
}
