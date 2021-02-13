package by.academy.cw.cw9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
    public static void main(String[] args) {
        LocalDate newYear1970 = LocalDate.of(1970, 1, 1);

        LocalDate s = newYear1970.plusYears(30);
         s = newYear1970.minusMonths(7);
        LocalDate s = newYear1970.minusDays(3);
        System.out.println(s);

    }
}
