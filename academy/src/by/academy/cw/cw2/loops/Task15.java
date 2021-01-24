package by.academy.cw.cw2.loops;

import java.util.Scanner;

public class Task15 {
//      Написать программу,
//      которая по заданным значениям чисел a и b находит a в степени b.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите число а");
        int a = scan.nextInt();

        System.out.println("введите число b");
        int b = scan.nextInt();

        System.out.println(Math.pow(a, b));


    }
}
