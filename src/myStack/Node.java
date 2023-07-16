package myStack;

public class Node<T> {
    public T data;
    // посилання на наступний елемент стеку
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}
