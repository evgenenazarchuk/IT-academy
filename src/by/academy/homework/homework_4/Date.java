package by.academy.homework.homework_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Date {


    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дату:");
        String dat = scan.next();
        scan.close();

        Date prod = new Date();
        System.out.println(prod.Datea(dat));
        System.out.println(prod.Dateb(dat));

        if (prod.Datea(dat)) {
            SimpleDateFormat format = new SimpleDateFormat();
            format.applyPattern("dd/MM/yyyy");
            java.util.Date date = format.parse(dat);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            simpleDateFormat.applyPattern("dd");
            System.out.println("День : " + simpleDateFormat.format(date));
            simpleDateFormat.applyPattern("MMM");
            System.out.println("Месяц : " + simpleDateFormat.format(date));
            simpleDateFormat.applyPattern("yyyy");
            System.out.println("Год : " + simpleDateFormat.format(date));
        } else if (prod.Dateb(dat)) {
            SimpleDateFormat format = new SimpleDateFormat();
            format.applyPattern("dd-MM-yyyy");
            java.util.Date date = format.parse(dat);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            simpleDateFormat.applyPattern("dd");
            System.out.println("День : " + simpleDateFormat.format(date));
            simpleDateFormat.applyPattern("MMM");
            System.out.println("Месяц : " + simpleDateFormat.format(date));
            simpleDateFormat.applyPattern("yyyy");
            System.out.println("Год : " + simpleDateFormat.format(date));

        }
    }

    public boolean Datea(String s) {
        String regex = "\\d{4}-\\d{2}-\\d{2}";
        return s.matches(regex);
    }

    public boolean Dateb(String s) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])[-](0[1-9]|1[012])[-]((19|20)\\d\\d)$";
        return s.matches(regex);
    }
}