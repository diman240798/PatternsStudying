package strategy;

public class Delevation_vs_Composition {
    /*
    * Делегирование - прямое имплементирование (субклассирование)
    * при этом поведение задается внутри объекта
    *
    * Композиция - задание поведение через объект (абстракцию)
    * соответсвует паттерну Стратегия
    * */

    public static void main(String[] args) {
        SomeBehaviour someBehaviourDelegation = new Delegation();
        someBehaviourDelegation.behaveSomeHow();

        SomeBehaviour someBehaviourComposition = () -> System.out.println("Behave via Composition");
        Strategy_Composition strategy_composition = new Strategy_Composition(someBehaviourComposition);
        strategy_composition.getSomeBehaviour().behaveSomeHow();
    }
}
interface SomeBehaviour {
    void behaveSomeHow();
}

class Delegation implements SomeBehaviour{
    @Override
    public void behaveSomeHow() {
        System.out.println("Behave via DELEGATION");
    }
}

class Strategy_Composition {
    private SomeBehaviour someBehaviour;

    public Strategy_Composition(SomeBehaviour someBehaviour) {
        this.someBehaviour = someBehaviour;
    }

    public SomeBehaviour getSomeBehaviour() {
        return someBehaviour;
    }

    public void setSomeBehaviour(SomeBehaviour someBehaviour) {
        this.someBehaviour = someBehaviour;
    }
}
