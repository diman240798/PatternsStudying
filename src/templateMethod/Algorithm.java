package templateMethod;

public abstract class Algorithm {
    public final void doJob() {
        prepare();
        doOne();
        doSecond();
        doThird();
    }

    protected abstract void prepare();
    protected abstract void doOne();
    protected abstract void doSecond();
    protected abstract void doThird();
}
