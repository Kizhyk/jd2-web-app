package com.kizhyk.controller.command;

import com.kizhyk.controller.command.impl.SignUp;
import com.kizhyk.controller.command.impl.SignIn;
import com.kizhyk.controller.command.impl.Unsupported;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(CommandName.SIGNIN, new SignIn());
        commands.put(CommandName.SIGNUP, new SignUp());
        commands.put(CommandName.UNSUPPORTED, new Unsupported());
    }

    public Command getCommand(String name) {
        Command command = null;

        try {
            command = commands.get(CommandName.valueOf(name.toUpperCase()));
        } catch (IllegalArgumentException | NullPointerException e) {
            command = commands.get(CommandName.UNSUPPORTED);
        }

        return command;
    }
}
