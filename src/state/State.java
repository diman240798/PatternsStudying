package state;

public interface State {
    State onQuaterInserted(Controller controller);

    State onSoldOut(Controller controller);

    State onCrankTurned(Controller controller);

    State onEjectQuater(Controller controller);

    State onDispense(Controller controller);
}
