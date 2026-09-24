package javacore;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample {

    public static void main(String[] args) {

        Collection<String> c = new ArrayList<>();

        // add()
        c.add("Apple");
        c.add("Banana");
        c.add("Mango");

        System.out.println("Collection: " + c);

        // addAll()
        Collection<String> c2 = new ArrayList<>();
        c2.add("Orange");
        c2.add("Grapes");

        c.addAll(c2);

        System.out.println("After addAll: " + c);

        // contains()
        System.out.println("Contains Apple: " + c.contains("Apple"));

        // containsAll()
        System.out.println("Contains all c2: " + c.containsAll(c2));

        // size()
        System.out.println("Size: " + c.size());

        // remove()
        c.remove("Banana");

        System.out.println("After remove: " + c);

        // removeAll()
        c.removeAll(c2);

        System.out.println("After removeAll: " + c);

        // isEmpty()
        System.out.println("Is Empty: " + c.isEmpty());

        // iterator()
        Iterator<String> it = c.iterator();

        System.out.println("Using Iterator:");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // clear()
        c.clear();

        System.out.println("After clear: " + c);

        // isEmpty() after clear
        System.out.println("Is Empty after clear: " + c.isEmpty());
    }
}

Collection: [Apple, Banana, Mango]
After addAll: [Apple, Banana, Mango, Orange, Grapes]
Contains Apple: true
Contains all c2: true
Size: 5
After remove: [Apple, Mango, Orange, Grapes]
After removeAll: [Apple, Mango]
Is Empty: false
Using Iterator:
Apple
Mango
After clear: []
Is Empty after clear: true
