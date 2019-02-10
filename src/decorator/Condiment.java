package decorator;

public abstract class Condiment extends Beverage {
    protected final Beverage beverage;

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }
}
