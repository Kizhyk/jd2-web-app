package com.kizhyk.controller.command.impl;

import com.kizhyk.controller.command.Command;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UnsupportedCommand implements Command {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {

    }
}
