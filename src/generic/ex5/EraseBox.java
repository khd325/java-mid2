package generic.ex5;

public class EraseBox<T> {

    public boolean instanceCheck(Object param) {
//        return param instanceof T;
        return false;
    }

    public T create() {
//        return new T();
        return null;
    }
}
