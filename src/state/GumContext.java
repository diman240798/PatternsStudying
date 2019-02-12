package state;

public class GumContext implements Controller {
    private final State NO_QUARTER_STATE;
    private final State HAS_QUARTER_STATE;
    private final State SOLD_STATE;
    private final State SOLD_OUT_STATE;
    private final State WINNER_STATE;

    private State currentState;

    private int gumsCount;
    private int quartersCount;

    public GumContext(int gumsCount) {
        this.gumsCount = gumsCount;
        NO_QUARTER_STATE = new NoQuarterState();
        HAS_QUARTER_STATE = new HasQuarterState();
        SOLD_STATE = new SoldState();
        SOLD_OUT_STATE = new SoldOutState();
        WINNER_STATE = new WinnerState();
        if (isSoldOut())
            currentState = SOLD_OUT_STATE;
        else
            currentState = NO_QUARTER_STATE;
    }

    @Override
    public int getProductCount() {
        return gumsCount;
    }

    @Override
    public int getMoneyCount() {
        return quartersCount;
    }

    @Override
    public boolean isSoldOut() {
        return gumsCount == 0;
    }

    @Override
    public State getNoQuaterState() {
        return NO_QUARTER_STATE;
    }

    @Override
    public State getSoldState() {
        return SOLD_STATE;
    }

    @Override
    public State getSoldOutState() {
        return SOLD_OUT_STATE;
    }

    @Override
    public State getWinnerState() {
        return WINNER_STATE;
    }

    @Override
    public State getHasQuarterState() {
        return HAS_QUARTER_STATE;
    }

    @Override
    public void onGumSold() {
        gumsCount -= 1;
        quartersCount += 1;
    }

    public void insertQuarter() {
        currentState = currentState.onQuaterInserted(this);
    }

    public void ejectQuarter() {
        currentState = currentState.onEjectQuater(this);
    }

    public void turnCrank() {
        currentState = currentState.onCrankTurned(this);
        currentState = currentState.onDispense(this);
    }
}
