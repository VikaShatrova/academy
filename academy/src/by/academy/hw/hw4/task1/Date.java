package by.academy.hw.hw4.task1;

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

    public class Year {
        private String year;

        public Year() {
            super();
        }

        public Year(String year) {
            this.year = year;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public int parseYear(String year) {
            int thisYear = Integer.parseInt(getYear());
            return thisYear;
        }

        public void isLeapYear(int year) {
            if (year % 4 == 0) {
                if (year % 400 == 0 && year % 100 != 0) {
                }
                    System.out.println(year + " is leap year");
            } else {
                System.out.println(year + " isn't leap year");
            }
        }
    }

    public class Month {
        String month;

        public Month() {
            super();
        }

        public Month(String month) {
            this.month = month;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public int parseMonth(String year) {
            int thisMonth = Integer.parseInt(getMonth());
            return thisMonth;
        }
    }

    public class Day {
        String day;

        public Day() {
            super();
        }

        public Day(String day) {
            this.day = day;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public int parseDay(String year) {
            int thisDay = Integer.parseInt(getDay());
            return thisDay;
        }
    }
}
