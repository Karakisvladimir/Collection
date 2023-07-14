package myStack;

public class MyStack {
    // посилання на перший елемент стеку
    private Node top;
    // розмір стеку
    private int size;

    // створює порожній стек
    public MyStack() {
        top = null;
        size = 0;
    }

    // перевірка чи стек порожній
    public boolean isEmpty() {
        return top == null;
    }

    // повернути розмір стеку
    public int size() {
        return size;
    }

    // додає елемент в стек
    public void push(Object data) {
        Node newNode = new Node(data);

        // якщо стек порожній то вказівник top буде вказувати на наш елемент
        if (isEmpty())
            top = newNode;
            // інакше вказівник top буде вказувати на наш елемент, і його next буде вказувати на старий елемент
        else {
            newNode.next = top;
            top = newNode;
        }
        // збільшуємо розмір колекції
        size++;
    }

    // повертає перший елемент стеку
    public Object peek() {
        if (isEmpty())
            throw new RuntimeException("Stack Underflow");
        return top.data;
    }

    // повертає перший елемент стеку та видаляє його
    public Object pop() {
        Object element = peek();
        top = top.next;
        size--;
        return element;
    }

    // видаляє елемент за індексом
    public void remove(int index) {
        // перевіряємо чи елемент існує
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index out of bounds");

        // перевіряємо чи наш елемент є першим
        if (index == 0) {
            pop();
            return;
        }

        // пошук попереднього елемента для видаляємого
        Node previous = top;
        for (int i = 0; i < index - 1; i++)
            previous = previous.next;
        Node toRemove = previous.next;
        previous.next = toRemove.next;
        size--;
    }

    // очищає колекцію
    public void clear() {
        top = null;
        size = 0;
    }
}

//    Методи
//
//    push(Object value) додає елемент в кінець
//    remove(int index) видаляє елемент за індексом
//    clear() очищає колекцію
//    size() повертає розмір колекції
//    peek() повертає перший елемент стеку
//    pop() повертає перший елемент стеку та видаляє його з колекції