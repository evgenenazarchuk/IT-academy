package by.academy.homework.homework_6files;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "Task1.txt";
        try (Scanner read = new Scanner(System.in);
             BufferedWriter file = new BufferedWriter(new FileWriter(path))) {
            String line = "";
            do {
                System.out.print("Введите текст: ");
                line = read.nextLine();
                if (!line.toLowerCase().equals("stop")) {
                    file.write(line);
                    file.newLine();
                    file.flush();
                }

            } while (!line.toLowerCase().equals("stop"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

