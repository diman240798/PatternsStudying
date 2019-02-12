package state;

public interface Controller {
    int getProductCount();
    int getMoneyCount();

    boolean isSoldOut();

    State getNoQuaterState();

    State getSoldState();

    State getSoldOutState();

    State getWinnerState();

    State getHasQuarterState();

    void onGumSold();
}
