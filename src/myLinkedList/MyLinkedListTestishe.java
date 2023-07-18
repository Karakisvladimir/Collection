package myLinkedList;

public class MyLinkedListTestishe {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list.add("i"+ i);
        }
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(4000) = " + list.get(4000));
        list.remove(0);
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.size() = " + list.size());
        list.clear();
        System.out.println("list.size() = " + list.size());
    }
}

