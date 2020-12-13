package by.academy.homework.homework_6.Task3;

import java.util.Iterator;
public class ArrayIterator <T> implements Iterator<T> {
    private T[][] m;
    private int i, j;
    public ArrayIterator(T[][] m) {
        this.m = m;
    }
    @Override
    public boolean hasNext() {
        return i < m.length && j < m[i].length;
    }
    @Override
    public T next() {
        T r = m[i][j++];
        if (j >= m[i].length) {
            i++;
            j = 0;
        }
        return r;
    }
}


