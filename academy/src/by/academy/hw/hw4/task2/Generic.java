package by.academy.hw.hw4.task2;

public class Generic<T> {
    private T[] array;

    public Generic() {
        super();
        this.array = (T[]) new Object[16];
    }

    public Generic(int num) {
        super();
        this.array = (T[]) new Object[num];
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T get(int i) {
        if (i < array.length) {
            return array[i];
        }
        return null;
    }

    public T getLast() {
        return array[array.length - 1];
    }

    public T getFirst() {
        return array[0];
    }

    public void getArrayLength() {
        System.out.println(array.length);
    }

    public int getLastElementIndex() {
        int i = 0;
        for (int j = array.length - 1; j >= 0; j--) {
            if (array[j] != null) {
                i = j;
                break;
            }
        }
        return i;
    }

    public void remove(int i) {
        if (i < array.length) {
            array[i] = null;
        }
    }

    public void remove(T obj) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(obj)) {
                array[i] = null;
            }
        }
    }
}
