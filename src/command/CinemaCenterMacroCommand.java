package command;

public class CinemaCenterMacroCommand {
    private final Command[] commands;

    public CinemaCenterMacroCommand() {
        commands = new Command[]{new TVcontrol(), new AudioControl(), new DVDcontrol()};
    }
    void turnOnCinema() {
        for (Command command: commands) {
            command.execute();
        }
    }

    void turnOffCinema() {
        for (Command command: commands) {
            command.unDo();
        }
    }
}
