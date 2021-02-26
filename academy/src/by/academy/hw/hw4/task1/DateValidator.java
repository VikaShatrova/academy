package by.academy.hw.hw4.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator implements Validator {

    public String regexp = "([0-2]\\d|3[01])[-/. ](0\\d|1[012])[-/. ](\\d{4})";
    Pattern pattern = Pattern.compile(regexp);

    @Override
    public Boolean validate(String stringDate) {
        Matcher matcher = pattern.matcher(stringDate);
        return matcher.matches();
    }
}
