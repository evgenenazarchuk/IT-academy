package by.academy.homework_3;
import java.util.*;
/*
Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
 Если таких слов несколько, найти первое из них.
 */

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Vvedite slova: ");
            String str = scanner.nextLine();
            if ("".equals(str))
                break;
            String shortWord = str;
            for (String word : str.split("[\\p{Space}\\p{Punct}]+"))
                if (word.length() < shortWord.length())
                    shortWord = word;
            System.out.println("1 слово с минимальных набором (" + shortWord.length() + " символов) это: " + shortWord);
        }
        scanner.close();
    }

        }




