package by.academy.cw.cw2;

public class Task6 {
    public static void main(String[] args) {
        double sum = 200;
        int percent = 3;
        int years = 3;

        for (int i = 0; i < years; i++) {
            sum = sum + (sum * percent * 0.01);
        }
        System.out.println(sum);
    }
}
