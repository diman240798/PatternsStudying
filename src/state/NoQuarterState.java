package state;

public class NoQuarterState implements State {

    @Override
    public State onQuaterInserted(Controller controller) {
        System.out.println("Quarter Inserted");
        return controller.getHasQuarterState();
    }

    @Override
    public State onSoldOut(Controller controller) {
        System.out.println("No gums left");
        throw new RuntimeException("Sold Out No Quarter");
    }

    @Override
    public State onCrankTurned(Controller controller) {
        System.out.println("Insert quarter first");
        return this;
    }

    @Override
    public State onEjectQuater(Controller controller) {
        return onCrankTurned(controller);
    }

    @Override
    public State onDispense(Controller controller) {
        return onCrankTurned(controller);
    }

}
