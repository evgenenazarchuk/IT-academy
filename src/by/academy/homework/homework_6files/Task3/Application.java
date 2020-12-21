package by.academy.homework.homework_6files.Task3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) throws IOException {

        ArrayList<String> users = new ArrayList<>();
        users.add("Иванов Иван");
        users.add("Петров Петр");
        users.add("Назарчук Евгений");
        users.add("Максимов Максим");
        users.add("Антонов Максим");
        users.add("Левонюк Артем");
        users.add("Козак Алексей");
        users.add("Сулковский Сергей");
        users.add("Стреха Леонид");
        users.add("Гончар Евгений");


        File dir = new File("users");

        if (!dir.exists()) {
            dir.mkdir();
        }
        int counter = 0;
        for (int i = 0; i < users.size(); i++) {
            File file = new File(dir, users.get(i) + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }
           /* try (FileWriter fw = new FileWriter(file)) {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите users: ");
                String s = in.nextLine();
                users.get()
                fw.write(users[counter++] + " ");
                fw.write(ldt.toString());*/
            }

        }
    }




