package by.academy.homework.homework_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidator implements Validator {


    public boolean isValid(String string) {

        Pattern pattern = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
        Matcher matcher = pattern.matcher(string);
        boolean b = matcher.matches();
        System.out.println("E-mail адрес провалидирован: " + b);

        return false;
    }
}
