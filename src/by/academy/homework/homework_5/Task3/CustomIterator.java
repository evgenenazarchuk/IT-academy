package by.academy.homework.homework_5.Task3;

import java.util.Iterator;

//3.Написать свой итератор для массива.

public class CustomIterator<T> implements Iterator<T> {

    private T[] array;
    private int index;

    public CustomIterator() {
        super();
    }

    public CustomIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (array == null || array.length <= index) {
            return false;
        }
        return array[index] != null;
    }

    @Override
    public T next() {
        return array[index++];
    }
}


