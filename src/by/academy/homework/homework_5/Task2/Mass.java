package by.academy.homework.homework_5.Task2;

public class Mass<T> {

    public final static int MASS_SIZE = 10;
    private int size;
    T arr[];

    public Mass() {
        super();
        arr = (T[]) (new Object[16]);
    }

    public Mass(int m) {
        super();
        arr = (T[]) (new Object[m]);
    }

    public void addMas(T obj) {
        if (arr == null) {


            arr = (T[]) new Object[MASS_SIZE];


        } else if (size + 1 > arr.length) {


            stepArray();
        }

        arr[size++] = obj;

    }


    private void stepArray() {
        T tempAr[] = (T[]) new Object[arr.length * 2 + 1];

        System.arraycopy(arr, 0, tempAr, 0, arr.length);
        arr = tempAr;
    }


    public T get(int i) {
        if (i < 0 || i > arr.length) {

            System.out.println("Error");
            return null;
        }
        return arr[i];
    }



    public T getLast() {

        return (T) arr[arr.length - 1];
    }


    public T getF() {
        return (T) arr[0];

    }
    public void showMas() {
        for (int j = 0; j < arr.length; j++) {

            System.out.print((T) arr[j] + " ");
        }
        System.out.println("");
    }

    public int massArray() {
        return arr.length;
    }

    public int lastValue() {
        int len = arr.length - 1;

        while (arr[len] == null && len >= 0) {
            len--;
        }

        if (len == -1) {
            return 0;
        }

        return len;
    }



    public void removeIndex(int index) {
        if (index < 0 && index > arr.length) {
            System.out.println("Ошибка удаления");
            return;
        }
        System.arraycopy(arr, index + 1, arr, index, arr.length - index - 1);
    }

    public void removeZn(T obj){
        if (obj == null) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == obj) {
                removeIndex(i);
            }

        }


    }


}
