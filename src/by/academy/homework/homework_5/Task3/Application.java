package by.academy.homework.homework_5.Task3;

public class Application {
    public static void main(String[] args) {

        Integer[] arr = { 1, 7, 9 };

        CustomIterator<Integer> iterator = new CustomIterator<>(arr);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
