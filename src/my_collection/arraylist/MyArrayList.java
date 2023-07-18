package my_collection.arraylist;

import java.util.StringJoiner;

public class MyArrayList<T> {
    private static final int INIT_SIZE = 8;
    private Object[] data;
    private int index;

    public MyArrayList() {
        data = new Object[INIT_SIZE];
    }

    public <T> void add(T value) {
        // resize
        if (index == data.length) {
            int newSize = data.length * 2;
            Object[] newData = new Object[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[index] = (T) value;
        index++;
    }

    public   void  remove(int numberIndex) {
        if (data.length < numberIndex || index < numberIndex) {
            throw new IndexOutOfBoundsException(index + " No Index");
        }
        for (int i = numberIndex; i < index; i++) {
            data[i] = data[i + 1];
        }
        index--;
    }

    public T get(int i) {
        if (i < 0 || i >= data.length) {
            throw new IndexOutOfBoundsException("Індекс повинен бути більше 0 і менший за довжину масиву");
        }
        return (T) data[i];
    }

    public int size() {
        return index;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < index; i++) {
            result.add((data[i].toString()));
        }
        return "[" + result + "]";
    }

    public void clear() {
        data = new String[10];
        index = 0;
    }
}


