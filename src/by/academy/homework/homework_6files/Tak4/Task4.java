package by.academy.homework.homework_6files.Tak4;

import java.io.*;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {


        File dir = new File("myFiles");
        File q = new File("result2.txt");
        File src = new File("Task2.txt");
        if (!src.exists()) {
            return;
        }
        if (!dir.exists()) {
            dir.mkdir();

        }

        for (int i = 0; i <= 100; i++) {
            File file = new File(dir, i + 1 + ".txt");
            if (!file.exists()) {
                file.createNewFile();

            }

            char[] arr = new char[576];
            int j = 0;
            StringBuilder str = new StringBuilder();
            try (FileReader fr = new FileReader(src)) {
                while ((j = fr.read(arr)) > 0) {
                    str.append(arr);
                }
            }

            System.out.println(str);

            String word = str.toString();
            System.out.println(word.length());
            try (FileWriter fw = new FileWriter(file)) {

                int maz = (int) (Math.random() * 576);
                fw.write(word.substring(0, maz) + "           ");


            }
        }


        try (FileWriter ff = new FileWriter(q)) {
            for (File file : dir.listFiles()) {

                ff.write("File name: " + file.getName() + " & length: " + file.length() + "\n");

            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}












