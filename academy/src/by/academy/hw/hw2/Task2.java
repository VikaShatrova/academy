package by.academy.hw.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("number of strings");
        int n = scan.nextInt();

        String[] arr = new String[n];
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLine();
        }

        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[i] = arr[i].length();
            for (int j = 0; j < arr[i].length(); j++) {
                if (j != arr[i].indexOf(arr[i].charAt(j))) {
                    count[i]--;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] < count[result]) {
                result = i;
            }
        }
        System.out.println(arr[result]);
    }
}
