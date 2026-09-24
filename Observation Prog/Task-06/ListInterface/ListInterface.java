package javacore;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class ListExample {

    public static void main(String[] args) {

        // Creating a List using ArrayList
        List<String> list = new ArrayList<>();

        // add(E e)
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Banana");

        System.out.println("List: " + list);

        // add(int index, E element)
        list.add(1, "Orange");
        System.out.println("After add(index): " + list);

        // get(int index)
        System.out.println("Element at index 2: " + list.get(2));

        // set(int index, E element)
        list.set(2, "Grapes");
        System.out.println("After set(): " + list);

        // remove(int index)
        list.remove(3);
        System.out.println("After remove(): " + list);

        // indexOf(Object o)
        System.out.println("Index of Banana: " + list.indexOf("Banana"));

        // lastIndexOf(Object o)
        System.out.println("Last index of Banana: " + list.lastIndexOf("Banana"));

        // subList(int fromIndex, int toIndex)
        System.out.println("SubList: " + list.subList(1, 3));

        // sort(Comparator)
        list.sort(Comparator.naturalOrder());
        System.out.println("After sort(): " + list);
    }
}
List: [Apple, Banana, Mango, Banana]
After add(index): [Apple, Orange, Banana, Mango, Banana]
Element at index 2: Banana
After set(): [Apple, Orange, Grapes, Mango, Banana]
After remove(): [Apple, Orange, Grapes, Banana]
Index of Banana: 3
Last index of Banana: 3
SubList: [Orange, Grapes]
After sort(): [Apple, Banana, Grapes, Orange]

