package myHashMap;

public class TestMyHashMap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put("Vovan", "Sidorchuk");
        map.put("Shimon", "Peres");
        map.put("Luck", "Skayvoker");
        map.put("Luchiano", "Pavoroti");
        System.out.println("map.size() = " + map.size());
        System.out.println("Last Name is  " + map.get("Vovan"));
        map.remove("Vovan");
        System.out.println("map.size() = " + map.size());
        map.clear();
        System.out.println("check collection is clear " + map.size());
    }
}
