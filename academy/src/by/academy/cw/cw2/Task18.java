package by.academy.cw.cw2;

public class Task18 {
//    Задано натуральное число N.
//    Найти количество натуральных чисел, не превосходящих N и
//    не делящихся ни на одно из чисел 2,3,5.

    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
