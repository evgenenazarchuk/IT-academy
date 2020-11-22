package by.academy.homework.homework_4;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Dataparse {
    public static void main(String[] args) {

        Scanner scandate = new Scanner(System.in);
        System.out.println("Ведите дату в формате dd/MM/yyyy или dd-MM-yyyy");
        String date1 = scandate.next();
        boolean len1 = date1.matches("\\d{2}\\-\\d{2}\\-\\d{4}");
        boolean len2 = date1.matches("\\d{2}\\/\\d{2}\\/\\d{4}");
        if (len1 == false && len2 == false) {
            System.out.println("Не верный формат даты");
            return;
        }
        GregorianCalendar calendar = new GregorianCalendar(2017, Calendar.JANUARY, 25);
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);
        System.out.println("Год: " + calendar.get(Calendar.YEAR));
        System.out.println("Месяц: " + calendar.get(Calendar.MONTH));
        System.out.println("Число: " + calendar.get(Calendar.DAY_OF_MONTH));

    }


}
