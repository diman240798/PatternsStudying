package Observer;

public interface Observable {
    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void updateObservers();

}
