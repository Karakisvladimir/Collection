package my_collection.arraylist;

import my_collection.arraylist.MyArrayList;

public class MyCollectionTests {
    public static void main(String[] args) {
        // MyArrayList
        MyArrayList<Number> list = new MyArrayList();
        list.add(1);
        list.add(5);
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
        list.remove(0);
        list.clear();
        System.out.println("list.size() = " + list.size());



    }
}