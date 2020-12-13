package by.academy.homework.homework_6.Task4;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw4 {
    public static void main(String[] args) {
        int element = 20;
        ArrayList<Integer> mark = new ArrayList<Integer>();

        for (int i = 0; i < element; i++) {
            mark.add(i, (int)
                    (Math.random() * 10 + 1));

        }
        int max = mark.get(0);


           for (Iterator<Integer> it = mark.iterator(); it.hasNext(); ) {
                Integer i = it.next();
                if (i > max)
                    max = i;
            }
            System.out.println("Массив оценок: " +mark);
            System.out.println("Максимальная оценка: "+max);


    }
}


