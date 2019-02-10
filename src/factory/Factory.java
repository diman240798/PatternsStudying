package factory;

public class Factory {
    /*
     * Обыно содержит static метод,
     * который выдает объекты соглано входным параметрам
     * */

    public static Result makeSmth(boolean param1, boolean param2) {
        if (param1)
            return Result.ONE_RESULR;
        else
            return Result.SECOND_RESULT;
    }
}

enum Result {
    ONE_RESULR, SECOND_RESULT
}