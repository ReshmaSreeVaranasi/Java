package javacore;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add()
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");   // Duplicate
        System.out.println("After add(): " + set);

        // remove()
        set.remove("B");
        System.out.println("After remove(): " + set);

        // contains()
        System.out.println("Contains A: " + set.contains("A"));

        // size()
        System.out.println("Size: " + set.size());

        // clear()
        set.clear();
        System.out.println("After clear(): " + set);
    }
}
