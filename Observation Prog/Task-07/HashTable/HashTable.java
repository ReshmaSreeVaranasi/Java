package javacore;
import java.util.HashTable;

class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> h = new Hashtable<>();

        h.put(1, "A");
        h.put(2, "B");
        h.put(3, "C");

        System.out.println(h);
        System.out.println(h.get(2));
        System.out.println(h.containsKey(1));
        System.out.println(h.containsValue("C"));
        System.out.println(h.size());
        System.out.println(h.isEmpty());

        h.remove(2);
        System.out.println(h);
    }
}
