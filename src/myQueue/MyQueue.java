package myQueue;

import myLinkedList.Node;

public class MyQueue<T> {
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


    public T peek(){
        return head.getValue();
    }
    public T poll(){
        T value = head.getValue();
        head = head.getNext();
        size--;
        return value;
    }



    public void clear() {
        head = null;
        size = 0;
    }
}



