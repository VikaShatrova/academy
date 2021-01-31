package by.academy.hw.hw2;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input number of players");
        int n = scan.nextInt();
        if (n <= 1 || n > 10) {
            System.out.println("incorrect data");

        } else {
            String[] mast = {"червей", "пик", "бубен", "треф"};
            String[] znach = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "К", "A"};
            int kolCard = mast.length * znach.length;

            String[] znachMast = new String[kolCard];
            for (int i = 0; i < znach.length; i++) {
                for (int j = 0; j < mast.length; j++) {
                    znachMast[mast.length * i + j] = znach[i] + " " + mast[j];
                }
            }
            for (int i = 0; i < kolCard; i++) {
                final Random r = new Random();
                int randCard = i + r.nextInt(kolCard - i);
                String temp = znachMast[randCard];
                znachMast[randCard] = znachMast[i];
                znachMast[i] = temp;
            }
            int cards = 5;
            for (int i = 0; i < cards * n; i++) {
                System.out.print(znachMast[i] + "; ");
                if (i % cards == cards - 1) {
                    System.out.println();
                }
            }
        }
    }
}
