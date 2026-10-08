import java.util.HashMap;

class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();

        m.put(1, "A");
        m.put(2, "B");
        m.put(3, "C");

        System.out.println(m);
        System.out.println(m.get(2));
        System.out.println(m.containsKey(1));
        System.out.println(m.containsValue("C"));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());
        System.out.println(m.size());
        System.out.println(m.getOrDefault(5, "Not Found"));

        m.remove(3);
        System.out.println(m);
    }
}
