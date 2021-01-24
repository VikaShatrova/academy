package by.academy.cw.cw2.loops;

import java.util.Scanner;

public class Task3 {
//     Составьте программу, составьте программу,
//     которая вычисляет произведение чисел от 1 до n.n вводится с клавиатуры.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input number");
        int n = scan.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println(f);
    }
}
