package by.academy.homework.homework_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class AmericanPhoneValidator implements Validator {

        @Override
        public boolean isValid(String string) {

            Pattern pattern = Pattern.compile("\\+1\\d{8}");
            Matcher matcher = pattern.matcher(string);
            boolean b = matcher.matches();
            System.out.println("Номер телефона зарегистирован в США: " + b);

            return false;
        }

    }


