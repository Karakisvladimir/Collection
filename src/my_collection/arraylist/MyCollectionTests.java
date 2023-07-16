package my_collection.arraylist;

public class MyCollectionTests {
    public static void main(String[] args) {
        MyArrayList<Number> list = new MyArrayList();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
            i++;
        }
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
        list.remove(0);
        list.clear();
        System.out.println("list.size() = " + list.size());
    }
}