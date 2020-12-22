package by.academy.homework.homework_6files.Task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) throws IOException {

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Иванов", "Иван", 22));
        users.add(new User("Петров", "Петр", 23));
        users.add(new User("Назарчук", "Евгений", 34));
        users.add(new User("Максимов", "Максим", 45));
        users.add(new User("Антонов", "Максим", 23));
        users.add(new User("Левонюк", "Артем", 56));
        users.add(new User("Козак", "Алексей", 67));
        users.add(new User("Сулковский", "Сергей", 67));
        users.add(new User("Стреха", "Леонид", 89));
        users.add(new User("Гончар", "Евгений", 56));

      /*  for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName() + " " + users.get(i).getSurname() + " " + users.get(i).getAge());
        }*/
        File dir = new File("users");

        if (!dir.exists()) {
            dir.mkdir();
        }

        for (int i = 0; i < users.size(); i++) {
            File file = new File(dir, users.get(i).getName() + "_" + users.get(i).getSurname() + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            try (FileWriter fw = new FileWriter(file)) {
                fw.write(users.get(i).getName() + " " + users.get(i).getSurname() + " " + users.get(i).getAge());
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }


        }
    }
}







