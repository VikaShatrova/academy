package by.academy.cw.cw9;

public class NGenericBox<Type> {
    private Type item;

    public NGenericBox(Type item) {
        this.item = item;
    }

    public Type getItem() {
        return item;
    }

    public void setItem(Type item) {
        this.item = item;
    }
}
