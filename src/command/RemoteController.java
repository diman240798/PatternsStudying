package command;

import java.util.Stack;

public class RemoteController {
    private final Command[] commands;
    private Stack<Command> lastCommands;

    public RemoteController(Command[] commands) {
        this.commands = commands;
    }

    void execute(int slot) {
        Command command = commands[slot];
        lastCommands.push(command);
        command.execute();
    }
    void unDo(int slot) {
        Command command = commands[slot];
        if (lastCommands.contains(command)) {
            lastCommands.remove(command);
        }
        command.unDo();
    }
    void unDoLast() {
        if (!lastCommands.isEmpty()) {
            Command pop = lastCommands.pop();
            pop.unDo();
        }
    }
}
