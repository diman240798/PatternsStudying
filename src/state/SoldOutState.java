package state;

public class SoldOutState implements State {
    @Override
    public State onQuaterInserted(Controller controller) {
        System.out.println("No gums left. Push the button to get your quarter back.");
        return controller.getHasQuarterState();
    }

    @Override
    public State onSoldOut(Controller controller) {

        return this;
    }

    @Override
    public State onCrankTurned(Controller controller) {
        System.out.println("No gums left");
        return this;
    }

    @Override
    public State onEjectQuater(Controller controller) {
        return onCrankTurned(controller);
    }

    @Override
    public State onDispense(Controller controller) {
        throw new UnsupportedOperationException();
    }
}
