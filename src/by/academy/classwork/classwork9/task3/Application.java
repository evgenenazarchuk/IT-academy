package by.academy.classwork.classwork9.task3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        myEnum arg = myEnum.SPRING;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите тип данных: ");
        String myEnum = in.nextLine();

        switch (arg)
        {
            case WINTER:
                System.out.println("It's winter!I love winter"); break;
            case SUMMER:
                System.out.println("It's summer!I love summer"); break;
            case SPRING:
                System.out.println("It's spring!I love spring"); break;
            case FALL:
                System.out.println("It's fall! I love fall!"); break;
        }
    }
}

