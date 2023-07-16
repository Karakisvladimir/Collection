package myHashMap;

public class HashMapRunner {
    public static void main(String[] args) {
        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("Vovan", "SD");
        map.put("Shimon", "Peres");
        map.put("Luck", "Skayvoker");
        map.put("Luchiano", "Pavoroti");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            map.put(sb.append(i).toString(), sb.append(i).toString());
        }
        System.out.println("map.size() = " + map.size());
        System.out.println("Last Name is  " + map.get("Vovan"));
        map.remove("Vovan");
        System.out.println("map.size() = " + map.size());
        map.clear();
        System.out.println("check collection is clear " + map.size());
    }
}
