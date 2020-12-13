package by.academy.homework.homework_6.Task6;

public class Hw6 {
    public static void Mass(int a) throws Exception {

        int[] mas = new int[8];
        for (int i = 0; i <= 10; i++) {
            mas[i] = (int) (Math.random() * 10 + 1);
            System.out.print(mas[i] + " ");
        }
    }


    public static void main(String args[]) {
        try {
            Mass(10);
        } catch (Exception e) {

            System.out.println(("\n Array is to small, expand the array"));
        }
    }
}





