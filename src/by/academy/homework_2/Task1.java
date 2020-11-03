/*
Ввести с консоли сумму покупки в магазине и возраст покупателя,
в зависимости от суммы вывести на экран ФИНАЛЬНУЮ ЦЕНУ с учетом скидки.

	Скидки:
	1) Сумма до 100 рублей -> 5%
	2) Сумма от 100 рублей включая до 200 рублей не включая -> 7%
	3) Сумма от 200 рублей включая до 300 рублей не включая -> 12%
	4) Сумма от 300 рублей включая до 400 рублей не включая -> 15%
	5) Сумма покупки больше 400 рублей включая -> 20%

В случае, если сумма покупки находится в 3 интервале (сумма от 200 рублей включая до 300 рублей не включая)
и возраст покупателя больше, чем 18 лет -> добавить 4% к скидке (12 + 4), иначе -> отнять 3%.
 */
package by.academy.homework_2;
import java.util.Scanner;



public class Task1 {
    public static void main(String[] args){
        System.out.print("Vvedite summu pokupki: ");
        Scanner sum = new Scanner(System.in);
        int num = sum.nextInt();
        System.out.print("Vvedite vozvrast pokupatela: ");
        Scanner pok = new Scanner(System.in);
        int voz = pok.nextInt();

        if (num<100)
            System.out.println(num-(num*0.05));
        else if (num>=100 && num<200)
            System.out.println(num-(num*0.07));
        else if (num>=200 && num<300 && voz>18)
            System.out.println(num-(num*0.12+0.04));
        else if (num>=200 && num<300 && voz<=18)
            System.out.println(num-(num*0.12-0.03));
        else if (num>=300 && num<400)
            System.out.println(num-(num*0.15));
        else if (num>=400)
            System.out.println(num-(num*0.2));




    }
}