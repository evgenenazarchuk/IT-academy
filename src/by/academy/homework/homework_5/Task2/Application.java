package by.academy.homework.homework_5.Task2;

public class Application {
    public static void main(String[] args) {
        Mass<Integer> q = new Mass<>();

        q.addMas(2);
        q.addMas(3);
        q.addMas(4);
        q.addMas(5);
        q.addMas(7);
        q.addMas(4);
        q.addMas(5);

        q.showMas();
        System.out.println("Значение по индексу = "+q.get(4));
        System.out.println("Значение последнего элемента = "+q.getLast());
        System.out.println("Значение первого элемента = "+q.getF());
        System.out.println("Размерность массива = "+q.massArray());
        System.out.println("Последний элемент = "+q.lastValue());
        q.removeIndex(3);
        q.removeZn(2);
        System.out.println(q.lastValue());
        q.showMas();
    }
}
