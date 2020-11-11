package by.academy.homework.homework_3;
import java.util.*;
 /*

Условие здачи: ввести 2 слова, состоящие из четного числа букв. Получить слово состоящее из первой половины первого слова и второй половины второго слова.
  */

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Vvedite slovo1: ");
        Scanner sl = new Scanner(System.in);
        String str1 = sl.nextLine();
        System.out.print("Vvedite slovo2: ");
        Scanner sl1 = new Scanner(System.in);
        String str2 = sl1.nextLine();
        System.out.println("Первое слово = " + str1);
        System.out.println("Второе слово = " + str2);
        String str3 = (str1.substring(0, str1.length()/2)) +
                (str2.substring(str2.length()/2, str2.length()));
        System.out.println(str3);
    }
}

