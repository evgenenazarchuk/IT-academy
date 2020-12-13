package by.academy.homework.homework_6.Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Hw1 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println("Массив значений: " + arrayList.toString());
        System.out.println("Значения без дубликатов: "+noDuplicates(arrayList));
    }

    public static <T> Collection<T> noDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }


}