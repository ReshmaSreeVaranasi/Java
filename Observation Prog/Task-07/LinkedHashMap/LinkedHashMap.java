package javacore;
import java.util.LinkedHashMap;

class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.containsKey(1));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        map.remove(2);
        System.out.println(map);
    }
}
