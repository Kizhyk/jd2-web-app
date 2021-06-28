package com.kizhyk.controller.command;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface Command {
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException;
}
