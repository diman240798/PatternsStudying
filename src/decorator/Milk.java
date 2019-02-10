package decorator;

public class Milk extends Condiment {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    double getCost() {
        return .25 + beverage.getCost();
    }
}
