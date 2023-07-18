package myLinkedList;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    public void add(T item) {
        Node<T> node = new Node<>(item, null);
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



