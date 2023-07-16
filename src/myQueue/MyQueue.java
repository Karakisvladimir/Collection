package myQueue;

public class MyQueue<T> {
    private Node<T> head;
    private int size;

    public void add(T item) {
        Node<T> node = new Node<>();
        node.setValue(item);
        if (head == null) {
            head = node;
        } else {
            Node<T> last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(node);
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



