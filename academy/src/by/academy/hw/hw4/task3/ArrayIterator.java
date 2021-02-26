package by.academy.hw.hw4.task3;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private T[][] array;
    private int cursorRow = 0;
    private int cursorColumn = 0;

    public ArrayIterator(T[][] array) {
        super();
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (array == null || cursorRow + 1 >= array.length) {
            return cursorColumn < array[cursorRow].length;
        }
        return cursorRow < array.length;
    }

    @Override
    public T next() {
        if (cursorColumn == array[cursorRow].length) {
            cursorColumn = 0;
            cursorRow++;
        }
        return array[cursorRow][cursorColumn++];
    }
}


