package adapter;

public class Adapter {
    /*
     * Используется чтобы подстроить внешний интерфейс библиотеке
     * под внутренний интерфей проекта. 
     *  */

    private final LibraryInterface libraryInterface;

    public Adapter(LibraryInterface libraryInterface) {
        this.libraryInterface = libraryInterface;
    }

    void doOneJobEqvivalent() {
        libraryInterface.doOneJob();
    }

    void doAnotherJobEqvivalent() {
        libraryInterface.doAnotherJob();
    }
}
