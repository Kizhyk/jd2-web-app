package com.kizhyk.controller.command;

import com.kizhyk.controller.command.impl.SignUpCommand;
import com.kizhyk.controller.command.impl.SignInCommand;
import com.kizhyk.controller.command.impl.UnsupportedCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(CommandName.SIGNIN, new SignInCommand());
        commands.put(CommandName.SIGNUP, new SignUpCommand());
        commands.put(CommandName.UNSUPPORTED, new UnsupportedCommand());
    }

    public Command getCommand(String name) {
        CommandName commandName = null;

        if (name == null) {
            name = CommandName.UNSUPPORTED.name();
        }

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
        } catch (IllegalArgumentException e) {
            commandName = CommandName.UNSUPPORTED;
        }

        return commands.get(commandName);
    }
}
