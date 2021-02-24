package by.academy.hw.hw3.deal.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
    private static final Pattern pattern = Pattern.compile("\\+1\\d{3}[-.]?\\d{3}[-.]?\\d{4}");

    @Override
    public Boolean validate(String stringAmericanPhone) {
        Matcher matcher = pattern.matcher(stringAmericanPhone);
        if (matcher.matches()==false){
            System.out.println("incorrect data");
        }
        return matcher.matches();
    }
}
