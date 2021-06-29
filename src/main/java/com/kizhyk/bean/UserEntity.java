package com.kizhyk.bean;

import java.io.Serial;
import java.io.Serializable;

public class UserEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 2041275512219239990L;

    private String login;
    private String email;
    private String password;

    public UserEntity() {
        login = "";
        email = "";
        password = "";
    }

    public UserEntity(String login, String email, String password) {
        this.login = login;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
