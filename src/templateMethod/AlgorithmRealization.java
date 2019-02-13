package templateMethod;

public class AlgorithmRealization extends Algorithm {
    @Override
    protected void prepare() {
        System.out.println("Prepare");
    }

    @Override
    protected void doOne() {
        System.out.println("Do one");
    }

    @Override
    protected void doSecond() {
        System.out.println("Do second");
    }

    @Override
    protected void doThird() {
        System.out.println("Do third");
    }
}
