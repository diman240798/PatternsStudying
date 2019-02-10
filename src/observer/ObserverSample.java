package observer;

public class ObserverSample implements Observer {
    @Override
    public void update() {
        System.out.println(String.format("observer %d is being updated.", hashCode()));
    }
}
