package by.academy.hw.hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input two strings");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("false");
        } else {
            System.out.println(falseTrue(str1, str2));
        }
    }

    public static boolean falseTrue(String str1, String str2) {
        int[] arrUni = new int[256];
        char[] arrStr1 = str1.toCharArray();

        for (char i : arrStr1) {
            arrUni[i]++;
        }
        for (int j = 0; j < str2.length(); j++) {
            int i = (int) str2.charAt(j);
            arrUni[i]--;
            if (arrUni[i] < 0) {
                return false;
            }
        }
        return true;
    }
}


