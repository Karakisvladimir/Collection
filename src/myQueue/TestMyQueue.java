package myQueue;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add("Mazda6");
        queue.add("Toyota");
        queue.add("Suzuki");
        System.out.println("first queue it " + queue.peek());
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.poll() = " + queue.poll());
        queue.clear();
        System.out.println("queue.size() = " + queue.size());
    }
}
