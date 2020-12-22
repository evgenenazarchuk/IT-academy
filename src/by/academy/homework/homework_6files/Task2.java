package by.academy.homework.homework_6files;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        File originalFile = new File("Task2.txt");
        File newFile = new File("result.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(originalFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
            String s;

            while ((s = br.readLine()) != null) {

                bw.write(s.replaceAll("\\s", ""));
                bw.newLine();

            }

        } catch (IOException e) {
            System.err.println("error during copying: " + e.getMessage());
        }

    }
}

