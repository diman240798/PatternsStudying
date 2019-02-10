package factory;

public class FactoryMethod implements BaseFactory {
    /*
    * Используется для создания семейства объектов
    * Может быть подменена во время работы
    * */

    @Override
    public A makeA() {
        return new A() {};
    }

    @Override
    public B makeB() {
        return new B() {};
    }
}
interface BaseFactory {
    A makeA();
    B makeB();
}
interface A{}
interface B{}
