package javacore;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // add(E e)
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");   // Duplicate, will not be added
        System.out.println("After add(): " + set);

        // contains(Object o)
        System.out.println("Contains B: " + set.contains("B"));

        // size()
        System.out.println("Size: " + set.size());

        // remove(Object o)
        set.remove("B");
        System.out.println("After remove(B): " + set);

        // isEmpty()
        System.out.println("Is set empty? " + set.isEmpty());

        // clear()
        set.clear();
        System.out.println("After clear(): " + set);

        // isEmpty() after clear
        System.out.println("Is set empty? " + set.isEmpty());
    }
}
