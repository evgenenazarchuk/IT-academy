package by.academy.homework.homework_5.Task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.temporal.ChronoUnit;
import by.academy.homework.homework_5.Task1.Date.DayOfWeek;

public class Application {
    static Pattern p = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])[-](0[1-9]|1[012])[-]((19|20|18)\\d\\d)$");
    private static int dayOfWeek;
    static long daysBetween;
    static Scanner sc = new Scanner(System.in);
    static String date;

    public static void main(String[] args) {

        enterDate();
        Date d1 = new Date(date);



        Calendar c = new GregorianCalendar(d1.year.getYear(), d1.month.getMonth() - 1, d1.day.getDay());
        dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(d1.getDayOfWeek(dayOfWeek));



        enterDate();
        Date d2 = new Date(date);
        Calendar c2 = new GregorianCalendar(d2.year.getYear(), d2.month.getMonth() - 1, d2.day.getDay());
        dayOfWeek = c2.get(Calendar.DAY_OF_WEEK);
        System.out.println(d2.getDayOfWeek(dayOfWeek));
        long firstDate = c.getTimeInMillis();
        long secondDate = c2.getTimeInMillis();
        daysBetween = d1.getDaysBetween(firstDate, secondDate);


        System.out.println("Количество дней, в заданном временном промежутке.: " + daysBetween);
        System.out.println(d1.year.isLeapYear(d1.year.getYear()));

    }

    public static boolean validation(String date) {
        Matcher m = p.matcher(date);
        return m.find();
    }

   public static void enterDate() {
        System.out.println("Введите дату в формате dd-mm-yyyy:");
        date = sc.next();
       if (validation(date) == true) {
           System.out.println("Введенная дата корректна");
        } else {
          System.out.println("Введенная дата не корректна");
        }
    }
}