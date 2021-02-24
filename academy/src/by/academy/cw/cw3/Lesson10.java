package by.academy.cw.cw3;

public class Lesson10<T, V, K> {
    T t;
    V v;
    K k;

    public Lesson10(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setV(V v) {
        this.v = v;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void showNameClass(){
        System.out.println(t.getClass().getName());
    }
}
