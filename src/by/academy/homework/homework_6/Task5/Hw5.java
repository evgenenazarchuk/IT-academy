package by.academy.homework.homework_6.Task5;

import java.util.HashMap;
import java.util.Scanner;

public class Hw5 {
    /*Можно писать все в main. Не нужно создавать новых классов.
    Имеется текст. Следует составить для него частотный словарь:
    Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.*/
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] words = string.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet()) {

            System.out.println("Значение: " +word + " " + "      Частота: " +  wordToCount.get(word));
        }

    }
}
