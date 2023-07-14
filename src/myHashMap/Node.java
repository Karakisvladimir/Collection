package myHashMap;

public class Node {
    Object key;
    Object value;
    Node next;

    Node(Object key, Object value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}