package com.kizhyk.controller.command.impl;

import com.kizhyk.controller.command.Command;
import com.kizhyk.service.ServiceFactory;
import com.kizhyk.service.exception.ServiceIllegalArgumentException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SignUpCommand implements Command {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String login = req.getParameter("login");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String message = null;
        try {
            ServiceFactory.getInstance().getUserService().signUp(login, email, password);
            message = String.format("Welcome to our website, %s!", login);
        } catch (ServiceIllegalArgumentException e) {
            message = "Please, enter new data and try again";
        }

        resp.getWriter().println(message);
    }
}
