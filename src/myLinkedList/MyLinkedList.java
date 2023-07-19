package myLinkedList;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;


    public void add(T item) {
        Node<T> newNode = new Node<>(item, null);
        if (size == 0) {
            tail = head = newNode;
        } else if (size == 1) {
            tail = newNode;
            head.setNext(tail);
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public  int size() {
        return size;
    }

    public T get(int index) {
        IndexCheckUtil.checkIndex(index, size);
        Node<T> search = head;
        for (int i = 0; i < index; i++) {
            search = search.getNext();
        }
        return search.getValue();
    }

    public void remove(int index) {
        IndexCheckUtil.checkIndex(index, size);
        Node current = head;
        if (index == 0) {
            head = current.getNext();
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext());
        }
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }
}



