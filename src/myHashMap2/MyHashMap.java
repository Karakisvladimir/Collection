package myHashMap2;
import java.util.Arrays;

public class MyHashMap<K, V> {
    private Node<K, V>[] arrayNode;
    private final int DEFAULT_SIZE_ARRAY = 17;
    private int size;

    public MyHashMap() {
        this.arrayNode = new Node[DEFAULT_SIZE_ARRAY];
        size = 0;
    }

    public void put(K key, V value) {
        if (size == arrayNode.length) {
            resize();
        }
        putValue(key, value);
        size++;
    }

    private void putValue(K key, V value) {
        Node<K, V> node = new Node<>(hashCode(key), key, value, null);
        int index = Math.abs(node.hash % arrayNode.length);
        Node<K, V> tmpNode = arrayNode[index];
        if (tmpNode == null) {
            arrayNode[index] = node;
        } else {
            while (tmpNode.next != null) {
                if (tmpNode.key.equals(key)) {
                    tmpNode.value = value;
                    return;
                }
                tmpNode = tmpNode.next;
            }
            if (tmpNode.key.equals(key)) {
                tmpNode.value = value;
            } else {
                tmpNode.next = node;
            }
        }
    }

    public V remove(K key) throws ValueNotFoundException {
        // Create tmpNode in order to calculate the HashCode and determine the index in the array
        Node<K, V> tmpNode = new Node<>(hashCode(key), key, null, null);
        Node<K, V> previousNode, nextNode;
        int index = Math.abs(tmpNode.hash % arrayNode.length);
        V result;
        if (arrayNode[index] != null) {
            do {
                previousNode = arrayNode[index];
                nextNode = arrayNode[index].next;
                if ((key == null && tmpNode.key == null) ||
                        (previousNode.key != null && tmpNode.key != null
                                && previousNode.key.equals(tmpNode.key))) {
                    result = previousNode.value;
                    arrayNode[index] = nextNode;
                    size--;
                    return result;
                }
                if (nextNode != null && previousNode.key != null && tmpNode.key != null) {
                    if (nextNode.key.equals(tmpNode.key)) {
                        result = nextNode.value;
                        previousNode.next = nextNode.next;
                        arrayNode[index] = previousNode;
                        size--;
                        return result;
                    }
                }
            } while (nextNode != null);
        }
        throw new ValueNotFoundException("Value not found");
    }

    public void clear() {
        this.arrayNode = new Node[DEFAULT_SIZE_ARRAY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) throws ValueNotFoundException {
        // Create tmpNode in order to calculate the HashCode and determine the index in the array
        Node<K, V> tmpNode = arrayNode[Math.abs(hashCode(key) % arrayNode.length)];
        while (tmpNode != null) {
            if ((key == null && tmpNode.key == null) || (key != null && key.equals(tmpNode.key))) {
                return tmpNode.value;
            }
            tmpNode = tmpNode.next;
        }
        throw new ValueNotFoundException("Value not found");
    }

    private int hashCode(Object key) {
        return key != null ? key.hashCode() : 0;
    }

    private void resize() {
        Node<K, V>[] newArrayNode = Arrays.copyOf(arrayNode, arrayNode.length);
        arrayNode = new Node[arrayNode.length * 2];
        for (Node<K, V> tmpNode : newArrayNode) {
            if (tmpNode != null) {
                Node<K, V> current = tmpNode;
                while (current.next != null) {
                    putValue(current.key, current.value);
                    current = current.next;
                }
                putValue(current.key, current.value);
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Node<K, V> kvNode : arrayNode) {
            if (kvNode != null) {
                result.append(kvNode);
                while (kvNode.next != null) {
                    result.append(", ").append(kvNode.next);
                    kvNode = kvNode.next;
                }
            }
        }
        return String.join(", ", result.toString());
    }
}
