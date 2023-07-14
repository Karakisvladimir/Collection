package myHashMap;

public class MyHashMap {
    private Node head;

    public void put(Object key, Object value) {
        if (head == null) {
            head = new Node(key, value);
        } else {
            Node current = head;
            while (current.next != null && current.key != key) {
                current = current.next;
            }
            if (current.key == key) {
                current.value = value;
            } else {
                current.next = new Node(key, value);
            }
        }
    }

    public void remove(Object key) {
        if (head != null) {
            if (head.key == key) {
                head = head.next;
            } else {
                Node current = head;
                boolean isRemoved = false;
                while (current.next != null && !isRemoved) {
                    if (current.next.key == key) {
                        current.next = current.next.next;
                        isRemoved = true;
                    } else {
                        current = current.next;
                    }
                }
            }
        }
    }

    public void clear() {
        head = null;
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        int size = 1;
        Node current = head;
        while (current.next != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public Object get(Object key) {
        Node current = head;
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }


}


//    Методи
//    put(Object key, Object value) додає пару ключ + значення
//    remove(Object key) видаляє пару за ключем
//    clear() очищає колекцію
//    size() повертає розмір колекції
//    get(Object key) повертає значення (Object value) за ключем

