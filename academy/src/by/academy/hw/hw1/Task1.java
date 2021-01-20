package by.academy.hw.hw1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input your age, please");

        int age = scan.nextInt();

        System.out.println("input the sum of shopping, please");

        double sum = scan.nextDouble();

        if (sum < 100) {
            System.out.println("the discounted sum: " + sum * 95 / 100);
        } else if (sum >= 100 && sum < 200) {
            System.out.println("the discounted sum: " + sum * 93 / 100);
        } else if (sum >= 200 && sum < 300) {
            if (age > 18) {
                System.out.println("the discounted sum: " + sum * 84 / 100);
            } else System.out.println("the discounted sum: " + sum * 91 / 100);
        } else if (sum >= 300 && sum < 400) {
            System.out.println("the discounted sum: " + sum * 85 / 100);
        } else System.out.println("the discounted sum: " + sum * 80 / 100);
    }
}
