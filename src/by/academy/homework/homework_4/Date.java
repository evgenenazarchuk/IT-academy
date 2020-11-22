package by.academy.homework.homework_4;


import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {

    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite data: ");
        String date = scanner.next();


        Date findDate = new Date();
        System.out.println("dd/MM/yyyy - " + findDate.Date1(date));
        System.out.println("dd.MM.yyyy - " + findDate.Date2(date));
    }

    public boolean Date1(String date1) {
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        return date1.matches(regex);
    }

    public boolean Date2(String date2) {
        String regex = "^\\d{2}.\\d{2}.\\d{4}$";
        return date2.matches(regex);
    }



}