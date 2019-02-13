package singleton;

public class SingletonEasy {
    private static SingletonEasy instance;

    public static SingletonEasy getInstance() {
        if (instance == null) {
            instance = new SingletonEasy();
        }
        return instance;
    }
}
