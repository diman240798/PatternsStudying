package command;

public class DVDcontrol implements Command {
    @Override
    public void execute() {
        System.out.println("DVD turned on");
    }

    @Override
    public void unDo() {
        System.out.println("DVD turned off");
    }
}
