package by.academy.classwork_3;
/*
Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.
 */

public class Task5 {
    public static void main(String[] args) {
        int j = 0;
        do {
            j++;
            if (j%5==0) {
                System.out.println(j);

            }
        }   while (j <= 100) ;


    }
}
