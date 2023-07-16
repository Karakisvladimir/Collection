package myStack;

public class TestMyStack1 {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        for (int i = 0; i < 1000000; i++) {
            stack.push(String.valueOf(i));
            i++;
        }
        stack.push("Mersedes");
        stack.push("Mazda");
        stack.push("Toyota");
        stack.push("BMW");
        System.out.println("stack.size() = " + stack.size());
        System.out.println("first element stack it " + stack.peek());
        System.out.println("return first element in collection and remove him = " + stack.pop());
        System.out.println("stack.size() = " + stack.size());
        stack.remove(0);
        System.out.println("stack.size() = " + stack.size());
        stack.clear();
        System.out.println("stack.size() = " + stack.size());

    }
}
