package javacore;

import java.util.Map;
import java.util.HashMap;

public class MapExample {

    public static void main(String[] args) {

        // Creating a Map using HashMap
        Map<Integer, String> m = new HashMap<>();

        // put()
        m.put(101, "Apple");
        m.put(102, "Banana");
        m.put(103, "Mango");

        System.out.println("Map: " + m);

        // get()
        System.out.println("Value of key 101: " + m.get(101));

        // remove()
        m.remove(102);
        System.out.println("After remove: " + m);

        // containsKey()
        System.out.println("Contains key 103: " + m.containsKey(103));

        // containsValue()
        System.out.println("Contains value Apple: " + m.containsValue("Apple"));

        // keySet()
        System.out.println("Keys: " + m.keySet());

        // values()
        System.out.println("Values: " + m.values());

        // entrySet()
        System.out.println("Entries: " + m.entrySet());

        // size()
        System.out.println("Size: " + m.size());

        // isEmpty()
        System.out.println("Is Empty: " + m.isEmpty());
    }
}
Map: {101=Apple, 102=Banana, 103=Mango}
Value of key 101: Apple
After remove: {101=Apple, 103=Mango}
Contains key 103: true
Contains value Apple: true
Keys: [101, 103]
Values: [Apple, Mango]
Entries: [101=Apple, 103=Mango]
Size: 2
Is Empty: false
