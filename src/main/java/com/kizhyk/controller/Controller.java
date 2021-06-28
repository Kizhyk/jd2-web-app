package com.kizhyk.controller;

import com.kizhyk.controller.command.CommandProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Controller extends HttpServlet {
    private final CommandProvider provider = new CommandProvider();

    private static final String COMMAND_REQUEST_PARAM = "command";
    private static final String INITIAL_PAGE_PATH = "/WEB-INF/jsp/index.jsp";

    public Controller() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(INITIAL_PAGE_PATH).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String command = req.getParameter(COMMAND_REQUEST_PARAM);
        provider.getCommand(command).execute(req, resp);
    }
}
