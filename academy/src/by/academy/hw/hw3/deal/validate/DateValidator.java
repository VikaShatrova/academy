package by.academy.hw.hw3.deal.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator implements Validator {
//   public String regexp = "^(0?[1-9]|1[012])[-/](0?[1-9]|[12][0-9]|3[01])[-/](19|20)?[0-9]{2}$";
    public String regexp = "([0-2]\\d|3[01])[-/. ](0\\d|1[012])[-/. ](\\d{4})";
   Pattern pattern = Pattern.compile(regexp);

    @Override
    public Boolean validate(String stringDate) {
        Matcher matcher = pattern.matcher(stringDate);
        if (matcher.matches()==false){
            System.out.println("incorrect data");
        }
        return matcher.matches();
    }
}
