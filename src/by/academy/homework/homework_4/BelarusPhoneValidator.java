package by.academy.homework.homework_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {


    @Override
    public boolean isValid(String string) {

        Pattern pattern = Pattern.compile("\\+375((29)|(33)|(25))[0-9]{7}");
        Matcher matcher = pattern.matcher(string);
        boolean b = matcher.matches();
        System.out.println("Номер телефона зарегистирован в РБ: " + b);

        return false;
    }
}
