package by.academy.cw.cw2.loops;

public class Task21 {
//    Дано натуральное n. вычислить 1/(2 в квадрате) + 1/(4 в квадрате)+ ... + 1/(2n в квадрате)
//    ( в квадрате только n)

    public static void main(String[] args) {
        int n = 6;
        double result = 0;

        for (int i = 1; i <= n; i++) {
            result += 1 / (Math.pow(2 * i, 2));
        }
        System.out.println(result);
    }
}
