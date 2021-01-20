package by.academy.hw.hw1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input number between 1 and 10");

        int num = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.print(num + "X" + i + "=");
            System.out.println(i * num);
        }
    }
}
