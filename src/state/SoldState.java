package state;

public class SoldState implements State {
    @Override
    public State onQuaterInserted(Controller controller) {
        System.out.println("Quarter Inserted");
        return controller.getHasQuarterState();
    }

    @Override
    public State onSoldOut(Controller controller) {
        System.out.println("Out of gums. Sorry");
        return controller.getSoldOutState();
    }

    @Override
    public State onCrankTurned(Controller controller) {

        throw new RuntimeException("Already giving you a gum");
    }

    @Override
    public State onEjectQuater(Controller controller) {
        throw new RuntimeException("Nothing to eject");
    }

    @Override
    public State onDispense(Controller controller) {
        System.out.println("Giving you ur gum.");
        controller.onGumSold();
        if (controller.isSoldOut()) {
            return controller.getSoldOutState();
        } else {
            return controller.getNoQuaterState();
        }
    }
}
