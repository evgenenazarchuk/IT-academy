package by.academy.homework.homework_6files.Task3;

import java.io.Serializable;

public class User implements Serializable {
    public String name;
    public String surname;
    public int age;


    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
