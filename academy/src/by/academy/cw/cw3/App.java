package by.academy.cw.cw3;

public class App {
    public static void main(String[] args) {
        T t = new T();
        V v = new V();
        K k = new K();
        Lesson10 lesson10 = new Lesson10(t, v, k);
        lesson10.showNameClass();
    }
}
