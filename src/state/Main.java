package state;

public class Main {
    public static void main(String[] args) {
        /*
        * Класс Context хранит все состояние и управляет
        * текущим, но ничего не знает о нем, потому что его смена
        * инкапсулируется в классах состояний.
        * */

        GumContext gumContext = new GumContext(10);

        gumContext.insertQuarter();
        gumContext.insertQuarter();

        gumContext.ejectQuarter();
        gumContext.ejectQuarter();

        gumContext.insertQuarter();
        gumContext.turnCrank();


    }
}
