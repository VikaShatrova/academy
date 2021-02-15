package by.academy.hw.hw3.deal.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");

    @Override
    public Boolean validate(String stringEmail) {
        Matcher matcher = pattern.matcher(stringEmail);
        if (matcher.matches()==false){
            System.out.println("incorrect data");
        }
        return matcher.matches();
    }
}
