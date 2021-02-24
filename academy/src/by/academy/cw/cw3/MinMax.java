package by.academy.cw.cw3;

public class MinMax<T extends Number> {
    T arr[];

    public MinMax(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public T min() {
        T min = arr[0];


        return min;
    }
}

