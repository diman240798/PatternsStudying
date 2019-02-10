package decorator;

public abstract class Beverage {
    private static final String BASIC_DESCRIPTION = "UNKNOW DESCRIPTION";

    abstract double getCost();
    String getDescription() {
        return BASIC_DESCRIPTION;
    }
}
