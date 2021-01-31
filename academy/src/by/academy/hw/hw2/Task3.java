package by.academy.hw.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input two words with even number of letters");
        String wrd1 = scan.nextLine();
        String wrd2 = scan.nextLine();

        System.out.println(wrd1.substring(0, wrd1.length() / 2)
                + wrd2.substring(wrd2.length() / 2, wrd2.length()));
    }
}