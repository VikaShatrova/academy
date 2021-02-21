package by.academy.hw.hw4;

public class Date {
    String date;

    public Date() {
        super();
    }

    public Date(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void showDay(String date) {
        System.out.println(date);
    }

    public static class Year {
        int year;

        public static class Month {
            int month;

            public static class Day {
                int day;
                DayOfWeek dayOfWeek;

                public enum DayOfWeek {
                    MONDAY, TUESDAY, WEDNESDAY,
                    THURSDAY, FRIDAY, SATURDAY, SUNDAY
                }

            }
        }
    }


}
