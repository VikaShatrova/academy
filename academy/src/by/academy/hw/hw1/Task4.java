package by.academy.hw.hw1;

public class Task4 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.print((int) Math.pow(2, i) + " ");
            i++;
        } while ((int) Math.pow(2, i) <= 1_000_000);
    }
}
