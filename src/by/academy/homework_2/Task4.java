/*
Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000.
 */
package by.academy.homework_2;

public class Task4 {
    public static void main(String[] args) {
        int chislo = 2;
// Возводимое в степень число

        int summa = chislo;
// Результат возведения в степень

        int power = 1;
// Начальный показатель степени

        do {
            System.out.println("Stepen " + power + " = " + summa);
            power++;
            summa = summa * chislo;
        } while (summa < 1000000);


    }
}


