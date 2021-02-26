package by.academy.hw.hw4.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        Date.Day day = date.new Day();
        System.out.println("input day (format dd)");
        day.setDay(scanner.nextLine());

        Date.Month month = date.new Month();
        System.out.println("input month (format MM)");
        month.setMonth(scanner.nextLine());

        Date.Year year = date.new Year();
        System.out.println("input year (format yyyy)");
        year.setYear(scanner.nextLine());

        String newDate = day.getDay() + "/" + month.getMonth() + "/" + year.getYear();

        DateValidator dateValidator = new DateValidator();
        if (dateValidator.validate(newDate)) {

            int year1 = year.parseYear(year.getYear());
            int month1 = month.parseMonth(month.getMonth());
            int day1 = day.parseDay(day.getDay());

            LocalDate dateBefore = LocalDate.of(year1, month1, day1);
            System.out.println("This is " + dateBefore.getDayOfWeek());
            year.isLeapYear(year1);

            DaysBetween daysBetween = new DaysBetween() {
                @Override
                public void outputDaysBetween() {
                    System.out.println("\ninput deal's date (format dd/MM/yyyy)");
                    String dateScan = scanner.nextLine();

                    if (dateValidator.validate(dateScan)) {
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate dateAfter = LocalDate.parse(dateScan, dtf);
                        long chronoUnit = ChronoUnit.DAYS.between(dateBefore, dateAfter);
                        System.out.println(chronoUnit);
                    } else {
                        System.out.println("incorrect date");
                    }
                }
            };
            daysBetween.outputDaysBetween();
            scanner.close();
        } else {
            System.out.println("incorrect date");
        }
    }
}
