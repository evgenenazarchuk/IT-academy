package by.academy.homework.homework_4;

import java.text.Format;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;
import java.text.DateFormat;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.Date;


public class Dateparse
{
    public static void main(String[] args) throws ParseException {
        Scanner scannerDate1 = new Scanner(System.in);
        System.out.println("Enter date: ");
        String stringDate1 = scannerDate1.next();
        Dateparse f = new Dateparse();
        if (f.proverka1(stringDate1)) {

            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();

            simpleDateFormat1.applyPattern("dd/mm/yyyy");
            Date enterDate = simpleDateFormat1.parse(stringDate1);

            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat();

            simpleDateFormat2.applyPattern("dd");
            System.out.println("day: " + simpleDateFormat2.format(enterDate));

            simpleDateFormat2.applyPattern("mm");
            System.out.println("month: " + simpleDateFormat2.format(enterDate));
            simpleDateFormat2.applyPattern("yyyy");

            System.out.println("year: " + simpleDateFormat2.format(enterDate));
        }




        else if (f.proverka2(stringDate1)) {
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
            simpleDateFormat1.applyPattern("dd.mm.yyyy");
            Date date = simpleDateFormat1.parse(stringDate1);

            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat();
            simpleDateFormat2.applyPattern("dd");
            System.out.println("day: " + simpleDateFormat2.format(date));

            simpleDateFormat2.applyPattern("MM");
            System.out.println("month: " + simpleDateFormat2.format(date));
            simpleDateFormat2.applyPattern("yyyy");
            System.out.println("year: " + simpleDateFormat2.format(date));



        } else {
            System.out.println("Error!");
        }

       // scannerDate1.close();
    }
    public boolean proverka1(String string) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/]((19|20|18)\\d\\d)$";
        return string.matches(regex);
    }

    public boolean proverka2(String string) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])[.](0[1-9]|1[012])[.]((19|20|18)\\d\\d)$";
        return string.matches(regex);
    }
}