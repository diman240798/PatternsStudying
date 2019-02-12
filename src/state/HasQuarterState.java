package state;

import java.util.Random;

public class HasQuarterState implements State {

    Random random = new Random(System.currentTimeMillis());

    @Override
    public State onQuaterInserted(Controller controller) {
        System.out.println("Quater was already inserted");
        return this;
    }

    @Override
    public State onSoldOut(Controller controller) {
        System.out.println("There are no gums left!");
        return this;
    }

    @Override
    public State onCrankTurned(Controller controller) {
        if (controller.isSoldOut()){
            return onSoldOut(controller);
        }
        State result;
        int rand = random.nextInt(10);
        boolean winner = rand == 0;
        if (winner && controller.getProductCount() > 1)
            result = controller.getWinnerState();
        else
            result = controller.getSoldState();
        return result;
    }

    @Override
    public State onEjectQuater(Controller controller) {
        System.out.println("Giving your quarter back.");
        return controller.getNoQuaterState();
    }

    @Override
    public State onDispense(Controller controller) {
        throw new UnsupportedOperationException();
    }
}
