package myHashMap;


public class MyHashMap<K, V> {

    private Node head;
    private int size;

    public MyHashMap() {

    }


    public void put(K key, V value) {

        Node node = new Node(key, value);
        boolean isExisted = false;

        if (head == null) {
            head = node;
            size++;
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                isExisted = true;
                break;
            }
            temp = temp.next;
        }

        if (!isExisted) {
            node.next = head;
            head = node;
            size++;
        }
    }

    public K remove(K key) {
        K result = null;
        if (head == null)
            return result;

        if (head.key.equals(key)) {
            result = (K) head.value;
            head = head.next;
            size--;
        } else {
            Node preNode = head;
            Node temp = preNode.next;
            while (temp != null) {
                if (temp.key.equals(key)) {
                    preNode.next = temp.next;
                    result = (K) temp.value;
                    size--;
                    break;
                }
                preNode = preNode.next;
                temp = temp.next;
            }
        }

        return result;
    }

    public void clear() {
        size = 0;
        head = null;
    }

    public int size() {
        return size;
    }

    public V get(K key) {

        if (head == null) return null;

        Node temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                return (V) temp.value;
            }
            temp = temp.next;
        }

        return null;
    }

    public boolean containsKey(K key) {

        Node temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public boolean containsValue(V value) {

        Node temp = head;
        while (temp != null) {
            if (temp.value.equals(value)) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

}