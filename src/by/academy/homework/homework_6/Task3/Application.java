package by.academy.homework.homework_6.Task3;

public class Application {
    public static void main(String[] args) {

        String[][] array = new String[][]{{"1"}, {"2", "3", "4", "5"}, {"6", "7"}, {"8", "9", "10", "11", "12"}};
        ArrayIterator<Integer> arrayIterator = new ArrayIterator(array);
        while (arrayIterator.hasNext()) {
            System.out.print(arrayIterator.next() + ", ");

        }

    }
}


