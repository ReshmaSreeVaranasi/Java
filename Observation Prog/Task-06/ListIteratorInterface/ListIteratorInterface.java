package javacore;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("List: " + list);

        ListIterator<String> it = list.listIterator();

        // Forward traversal
        System.out.println("Forward Traversal:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Backward traversal
        System.out.println("Backward Traversal:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

        // add()
        it.add("Orange");
        System.out.println("After add: " + list);

        // set()
        it.previous();
        it.set("Grapes");
        System.out.println("After set: " + list);

        // remove()
        it.remove();
        System.out.println("After remove: " + list);

        // Index methods
        System.out.println("Next Index: " + it.nextIndex());
        System.out.println("Previous Index: " + it.previousIndex());
    }
}
Output:
List: [Apple, Banana, Mango]
Forward Traversal:
Apple
Banana
Mango
Backward Traversal:
Mango
Banana
Apple
After add: [Orange, Apple, Banana, Mango]
After set: [Orange, Apple, Banana, Grapes]
After remove: [Orange, Apple, Banana]
Next Index: 3
Previous Index: 2
