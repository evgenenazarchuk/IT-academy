package by.academy.homework.homework_7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {

    public static void main(String[] args) {

        User user = new User("eugene", "123qaz", "evgen@mail.ru");

        Class<User> people = User.class;

        Method[] methods = people.getMethods();

        System.out.println("-----------------------");

        System.out.println("Method: ");

        System.out.println("-----------------------");

        for (Method method : methods) {

            System.out.println(method.getName());

        }

        try {

            Method meth = people.getMethod("printUserInfo");

            System.out.println("-----------------------");

            System.out.println("Method name is: " + meth.getName());

        } catch (NoSuchMethodException | SecurityException e1) {

            System.out.println("-----------------------");

            System.out.println("There is no public methods! ");

        }

        Field[] field = people.getFields();

        System.out.println("-----------------------");

        System.out.println("Field: ");

        System.out.println("-----------------------");

        for (Field f : field) {

            System.out.println(f.getName());

        }

        try {

            Field field1 = people.getDeclaredField("login");

            String loginValue = (String) field1.get(user);

            System.out.println("-----------------------");

            System.out.println("Field name is: " + loginValue);

            System.out.println("-----------------------");

        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {

            e.printStackTrace();

        }

        Method[] methods1 = people.getDeclaredMethods();

        System.out.println("DeclaredMethod: ");

        System.out.println("-----------------------");

        for (Method method : methods1) {

            System.out.println(method.getName());

        }

        try {

            Method declareMethod = people.getDeclaredMethod("printUserInfo");

            System.out.println("-----------------------");

            System.out.println("DeclaredMethod name is: " + declareMethod.getName());

            System.out.println("-----------------------");

        } catch (NoSuchMethodException | SecurityException e) {

            e.printStackTrace();

        }

        Field[] field2 = people.getDeclaredFields(); // getDeclaredFields()

        System.out.println("DeclaredFields: ");

        System.out.println("-----------------------");

        for (Field field3 : field2) {

            System.out.println(field3.getName());

        }

        try {

            Field field6 = people.getDeclaredField("password");

            field6.setAccessible(true);

            String passwordValue = (String) field6.get(user);

            System.out.println("-----------------------");

            System.out.println("DeclaredFields name is: " + passwordValue);

            System.out.println("-----------------------");

        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {

            e.printStackTrace();

        }

        try {

            Field field4 = people.getDeclaredField("login");

            field4.setAccessible(true);

            String loginValue = (String) field4.get(user);

            System.out.println("DeclaredFields name is: " + loginValue);

            System.out.println("-----------------------");

        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {

            e.printStackTrace();

        }

        System.out.println("set метод класса Field: ");

        System.out.println("-----------------------");

        try {

            Field setField = people.getDeclaredField("login");

            setField.setAccessible(true);

            setField.set(user, "eugene");

            String log = (String) setField.get(user);

            System.out.println("Login is: " + log);

        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {

            e.printStackTrace();

        }

        try {

            Field setField = people.getDeclaredField("password");

            setField.setAccessible(true);

            setField.set(user, "123qaz");

            String pas = (String) setField.get(user);

            System.out.println("Password is: " + pas);

        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {

            e.printStackTrace();

        }

        try {

            Field setFie = people.getDeclaredField("email");

            setFie.setAccessible(true);

            setFie.set(user, "evgen@mail.ru");

            String email = (String) setFie.get(user);

            System.out.println("Email is: " + email);

        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {

            e.printStackTrace();

        }

        System.out.println("----------------");
        System.out.println("toString через invoke:");

        try {

            Method mPrint = people.getDeclaredMethod("printUserInfo");

            mPrint.setAccessible(true);

            mPrint.invoke(user);

        } catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException

                | InvocationTargetException | SecurityException e) {

            e.printStackTrace();

        }
    }
}