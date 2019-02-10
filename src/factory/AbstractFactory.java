package factory;

public abstract class AbstractFactory  {
    public final void logic(boolean[] params) {
        /*
        * Используем определенную логику
        * но реализацию создания объектов
        * отдаем субклассам
        * */
        Something something = makeSomething(params);
    }

    abstract Something makeSomething(boolean[] params);
}

interface Something {
    void doSmth();
}
