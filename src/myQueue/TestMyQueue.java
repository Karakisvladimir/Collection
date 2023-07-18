package myQueue;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        queue.add("Mazda3");
        for (int i = 0; i < 100000; i++) {
            queue.add(String.valueOf(i));
        }
        System.out.println("first queue it " + queue.peek());
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.poll() = " + queue.poll());
        queue.clear();
        System.out.println("queue.size() = " + queue.size());
    }
}
