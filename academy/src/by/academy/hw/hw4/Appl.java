package by.academy.hw.hw4;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();

        System.out.println("input any date");
        date.setDate(scanner.nextLine());
        DateValidator dateValidator = new DateValidator();

        if (dateValidator.validate(date.date) == true) {
            date.showDay(date.date);
        }


        scanner.close();
    }
}
