package singleton;

public class SingletonSynchronized {
    private SingletonSynchronized instance;

    public synchronized SingletonSynchronized getInstance() {
        if (instance == null)
            instance = new SingletonSynchronized();
        return instance;
    }
}
