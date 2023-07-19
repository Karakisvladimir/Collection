package myHashMap2;

public class HashMapRunner {
    public static void main(String[] args) throws ValueNotFoundException {
        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("DD", "PP");
        for (int i = 0; i < 1000000; i++) {
            map.put("i" + i, "i" + i);
        }
        System.out.println("map.size() = " + map.size());
        System.out.println("map.get(DD) = " + map.get("DD"));
        System.out.println("map.remove(\"DD\") = " + map.remove("DD"));
        map.clear();
        System.out.println("map.size() = " + map.size());
    }

}
