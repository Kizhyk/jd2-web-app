package com.kizhyk.controller.command.impl;

import com.kizhyk.controller.command.Command;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SignUp implements Command {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //Service methods call
        resp.getWriter().println(String.format("Welcome to our website, %s!", req.getParameter("login")));
    }
}
