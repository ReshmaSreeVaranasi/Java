package javacore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

        // Creating a List
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("List: " + list);

        // Creating an Iterator
        Iterator<String> it = list.iterator();

        // hasNext() and next()
        System.out.println("Using Iterator:");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // remove()
        Iterator<String> it2 = list.iterator();

        while (it2.hasNext()) {
            String fruit = it2.next();

            if (fruit.equals("Banana")) {
                it2.remove();
            }
        }

        System.out.println("After remove: " + list);

        // forEachRemaining()
        Iterator<String> it3 = list.iterator();

        System.out.println("Using forEachRemaining:");

        it3.forEachRemaining(System.out::println);
    }
}
List: [Apple, Banana, Mango, Orange]
Using Iterator:
Apple
Banana
Mango
Orange
After remove: [Apple, Mango, Orange]
Using forEachRemaining:
Apple
Mango
Orange
