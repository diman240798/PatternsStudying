package decorator;

public class Coffee extends Beverage {
    @Override
    double getCost() {
        return 0.89;
    }

    @Override
    String getDescription() {
        return "Tasty Coffee";
    }
}
