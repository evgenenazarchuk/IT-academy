package by.academy.homework_3;
import java.util.*;
/*
Ввести n слов с консоли.
Найти слово, в котором число различных символов минимально.
Если таких слов несколько, найти первое из них.
 */
public class Task3 {
    public static String Task3(String str, int n) {
        //Scanner scan = new Scanner(System.in);
        //System.out.print("Vvedite slovo1: ");
        String s = "This is a sample sentence.";
        /* перегруппировывает строку в массив слов */
        String[] word = s.split(str, n);

        /* вычисляет слово с минимальным кол-вом различных символов */
        int count = 100; // минимальное число разлчных символов у слова word[i]
        int iAns = 0; // индекс искомого слова в массиве word
        for (int i = 0; i < word.length; i++) { // проход по словам у массива word
            int curCount = 0; // минимальное число различных сивмолов у слова word[i]
            for (int j = 0; j < word[i].length(); j++) { // проход по символам в слове word[i]
                char tmp = (char) word[i].indexOf(j); // j-тый символ
                if (word[i].indexOf(tmp) == j) {
                    curCount++;
                }
            }
            if (curCount < count) {
                count = curCount;
                iAns = i;
            }
        }
        return word[iAns];
    }
}
