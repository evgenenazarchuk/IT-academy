package by.academy.classwork_3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Vvedite chislo: ");
        Scanner ch = new Scanner(System.in);
        int num = ch.nextInt();
        for (int i = 1; i < num; i++) {
            System.out.printf("Сумма числа %d равна %d \n", i, i +i);

        }

    }
}

