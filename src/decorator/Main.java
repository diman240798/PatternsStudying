package decorator;

public class Main {
    /*
    * Заворачиваем несколько объектов
    * один в другой и делаем серию вызовов
    * методов с одинаковым названием
    * */
    public static void main(String[] args) {
        Beverage bevarage = new Coffee();
        bevarage = new Chokolate(bevarage);
        bevarage = new Milk(bevarage);
        System.out.println(bevarage.getCost());
    }
}
