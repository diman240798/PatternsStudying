package command;

public class AudioControl implements Command {
    @Override
    public void execute() {
        System.out.println("Audio turned on");
    }

    @Override
    public void unDo() {
        System.out.println("Audio turned off");
    }
}
