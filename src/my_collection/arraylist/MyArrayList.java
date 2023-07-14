package my_collection.arraylist;

import java.util.StringJoiner;

public class MyArrayList<T> {
    private static final int INIT_SIZE = 8;
    private Object[] data;
    private int index;


    public MyArrayList() {
        data = new Object[INIT_SIZE];

    }

    public void add(int value) {
        // resize
        if (index == data.length) {
            int newSize = data.length * 2;
            Object[] newData = new Object[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[index] = value;
        index++;

    }

    public void remove(int numberIndex) {
        if (data.length < numberIndex || index < numberIndex) {
            throw new IndexOutOfBoundsException(index + " No Index");
        } else data[index] = numberIndex;
        index--;

    }

    public T get(int i) {
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
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
        index = 0;
    }


}


