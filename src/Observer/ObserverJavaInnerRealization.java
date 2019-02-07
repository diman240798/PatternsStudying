package Observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverJavaInnerRealization {
    /*
    * Наблюдатель используется для реализации возможности
    * получнеия/передачи обновлений множуству объектов
    *
    * Java6 реализация отличается методом setChanged()
    * т.к. hasChanged() за отправление сообщений
    *
    * */
}

class Subscriber implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(String.format("Observer %d is being updated.", hashCode()));
    }
}
class JavaObservable extends Observable {}

