package singleton;

public class SingletonSynchronizedBlock {
    private volatile SingletonSynchronizedBlock instance;

    public SingletonSynchronizedBlock getInstance() {
        synchronized (SingletonSynchronizedBlock.class) {
            if (instance == null)
                instance = new SingletonSynchronizedBlock();
        }
        return instance;
    }
}
