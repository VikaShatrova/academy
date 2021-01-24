package by.academy.cw.cw2;

public class Task1 {
//    Составьте программу, выводящую на экран квадраты чисел от 10 до 20.

    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
            System.out.println("Квадрат числа " + i + " равен");
            System.out.println((int) Math.pow(i, 2) + " ");
        }
    }
}
