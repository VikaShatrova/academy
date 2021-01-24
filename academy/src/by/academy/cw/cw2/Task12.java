package by.academy.cw.cw2;

public class Task12 {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 10; i < 100; i++) {
            if (i % 13 == 0 && i % 2 != 0) {
                System.out.println(i);
                result *= i;
            }
        }
        System.out.println(result);
    }
}
