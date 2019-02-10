package observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableSample implements Observable {
    List<Observer> observers;

    public ObservableSample() {
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void updateObservers() {
        for (Observer current: observers) {
            current.update();
        }
    }
}
