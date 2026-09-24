package javacore;

import java.util.Set;
import java.util.HashSet;

public class SetExample {

    public static void main(String[] args) {

        // Creating a Set using HashSet
        Set<String> s = new HashSet<>();

        // add()
        s.add("Apple");
        s.add("Banana");
        s.add("Mango");
        s.add("Apple");  // Duplicate element

        System.out.println("Set: " + s);

        // remove()
        s.remove("Banana");
        System.out.println("After remove: " + s);

        // contains()
        System.out.println("Contains Apple: " + s.contains("Apple"));

        // size()
        System.out.println("Size: " + s.size());

        // isEmpty()
        System.out.println("Is Empty: " + s.isEmpty());

        // clear()
        s.clear();
        System.out.println("After clear: " + s);

        // isEmpty() after clear
        System.out.println("Is Empty after clear: " + s.isEmpty());
    }
}
Set: [Apple, Mango, Banana]
After remove: [Apple, Mango]
Contains Apple: true
Size: 2
Is Empty: false
After clear: []
Is Empty after clear: true
