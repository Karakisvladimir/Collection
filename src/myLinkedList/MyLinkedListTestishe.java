package myLinkedList;

public class MyLinkedListTestishe {

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        System.out.println("list.size() = " + list.size());

        list.add("Alfa");
        System.out.println("list.size() = " + list.size());

        list.add("Beta");
        System.out.println("list.size() = " + list.size());

        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));
        // write Exception no it index👍
       // System.out.println("list.get(2) = " + list.get(2));
        list.remove(0);
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.size() = " + list.size());
        list.add("Bobic");
        list.add("Forik");
        System.out.println("list.size() = " + list.size());
        list.clear();
        System.out.println("list.size() = " + list.size());


    }
}

