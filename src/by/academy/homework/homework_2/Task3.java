/*
Ввести с консоли число от 1 до 10, вывести на экран таблицу умножения для этого числа. (10 чисел).
 */

package by.academy.homework.homework_2;
import java.util.Scanner;



public class Task3 {
    public static void main(String[] args) {
        System.out.print("Vvedyte chislo:  ");
        int number=new Scanner(System.in).nextInt();

        table(number);

    }
    static void table(int number){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(number + " * "+ i +" = "+number*i);
        }


    }

    }

