package myHashMap;




class Node< K , V>{
    public K key;
    public V value;
    public Node next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;

    }
}