package myStack;

public class MyStack<T> {
    private Node top;
    private int size;

    // створює порожній стек
    public MyStack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public T push(T data) {
        Node<T> newNode = new Node<T>(data);
        if (isEmpty())
            top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
        size++;
        return data;
    }

    public T peek() {
        if (isEmpty())
            throw new RuntimeException("Stack Underflow");
        return (T) top.data;
    }

    // повертає перший елемент стеку та видаляє його
    public T pop() {
        Object element = peek();
        top = top.next;
        size--;
        return (T) element;
    }

    public void remove(int index) {
        IndexCheckUtil.checkIndex(index, size);
        if (index == 0) {
            pop();
            return;
        }

        // пошук попереднього елемента для видаляємого
        Node previous = top;
        for (int i = 0; i < index - 1; i++)
            previous = previous.next;
        Node toRemove = previous.next;
        previous.next = toRemove.next;
        size--;
    }

    public void clear() {
        top = null;
        size = 0;
    }
}

//    Методи
//
//    push(Object value) додає елемент в кінець
//    remove(int index) видаляє елемент за індексом
//    clear() очищає колекцію
//    size() повертає розмір колекції
//    peek() повертає перший елемент стеку
//    pop() повертає перший елемент стеку та видаляє його з колекції

