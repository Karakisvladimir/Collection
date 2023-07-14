package myQueue;

public class MyQueue {
    Node front, rear;
    int size;


    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void add(Object data) {
        // Create a new node
        Node temp = new Node(data);
        // Checks if queue is empty.
        if (front == null) {
            front = temp;
            rear = temp;
        } else {
            // Add the new node at the end of the queue.
            rear.next = temp;
            rear = rear.next;
        }

        size++;
    }

    public Object poll() {
        if (size == 0) {
            return null;
        }

        Object data = front.data;
        // Move the front node
        front = front.next;
        // Decrease size by one
        size -= 1;
        return data;
    }

    public Object peek() {
        if (size == 0) {
            return null;
        }
        return front.data;
    }

    public int size() {
        return size;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }


}






