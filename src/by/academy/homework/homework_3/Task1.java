package by.academy.homework.homework_3;
import java.util.*;

/*

Ввести две строки с консоли. Определить, является ли одна строка перестановкой символов другой строки.
Учитываем регистр. Не использовать сортировку :)
Например:
    1. “hello” и “hlleo” -> true
    2. “hello” и “art” -> false
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Vvedite slovo1: ");

        String oneLine = scan.nextLine();
        System.out.print("Vvedite slovo2: ");

        String secondLine = scan.nextLine();



        if (oneLine.length() != secondLine.length()) {
            System.out.println(false);
            return;
        }

        int[] letters = new int[500];

        char[] s_array = oneLine.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }

        for (int i = 0; i < secondLine.length(); i++) {
            int c = (int) secondLine.charAt(i);
            if (--letters[c] < 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
        return;
    }


    }

