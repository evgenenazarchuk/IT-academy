package by.academy.homework.homework_6.Task2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task2 {

    public static void main (String[]args){
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        addArray(arraylist);
        System.out.println(arraylist);
        getArray(arraylist);

        LinkedList<Integer> list = new LinkedList<Integer>();
        addList(list);
        System.out.println(list);
        getList(list);
    }
        public static void addArray(ArrayList < Integer > array) {
            for (int i = 0; i <= 10000; i++) {
                array.add((Integer) (int) (Math.random() * 10));
            }
        }

        public static void addList (LinkedList < Integer > list) {
            for (int i = 0; i <= 10000; i++) {
                list.add((Integer) (int) (Math.random() * 10));
            }
        }

        public static void getArray (ArrayList < Integer > array) {
            long startTime = System.currentTimeMillis();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i <= 1000; i++) {
                arr.add(array.get((int) ((i) * (Math.random() * 10))));
            }
            System.out.println(arr);
            System.out.println(System.currentTimeMillis() - startTime);
        }

        public static void getList (LinkedList < Integer > list) {
            long startTime = System.currentTimeMillis();
            LinkedList<Integer> arr = new LinkedList<>();
            for (int i = 0; i <= 1000; i++) {
                arr.add(list.get((int) ((i) * (Math.random() * 10))));
            }
            System.out.println(arr);
            System.out.println(System.currentTimeMillis() - startTime);
        }


    }
