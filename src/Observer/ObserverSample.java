package Observer;

public class ObserverSample implements Observer {
    @Override
    public void update() {
        System.out.println(String.format("Observer %d is being updated.", hashCode()));
    }
}
