package by.academy.classwork.classwork5;

public class Task1 {
    /*
    Задание 1.

a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
б) Распечатать последний символ строки. Используем метод String.charAt().
в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
ж) Заменить все символы “а” на “о”.
з) Преобразуйте строку к верхнему регистру.
и) Преобразуйте строку к нижнему регистру.
к) Вырезать строку Java c помощью метода String.substring().
     */
    public static void main(String[] args) {
        String str1 = "I like Java!!!";
        boolean retVal1;

        System.out.println(str1);
        char result1 = str1.charAt(13);
        retVal1 = str1.endsWith("!!!");
        retVal1 = str1.startsWith("I like");
        int index1 = str1.indexOf("Java");
        String str1Upper = str1.toUpperCase();
        System.out.println(result1);
        System.out.println(retVal1);
        System.out.println(retVal1);
        System.out.println(str1.contains("Java"));
        System.out.println("Мы ищем 'Java' в символе " +index1 );
        System.out.print("Возвращаемое значение: " );
        System.out.println(str1.replace('a','o'));
        System.out.println("Изменение строки в верхний регистр: " + str1Upper);

        System.out.print("Возвращаемое значение: ");
        System.out.println(str1.toLowerCase());
        System.out.println(str1.substring(7,11));

        }
    }

