package command;

public class TVcontrol implements Command {

    @Override
    public void execute() {
        System.out.println("TV turned on");
    }

    @Override
    public void unDo() {
        System.out.println("TV turned off");
    }
}
