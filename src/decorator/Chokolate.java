package decorator;

public class Chokolate extends Condiment {
    public Chokolate(Beverage beverage) {
        super(beverage);
    }

    @Override
    double getCost() {
        return 0.3 + beverage.getCost();
    }
}
