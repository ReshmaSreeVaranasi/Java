package javacore;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

public class SortedSetExample {

    public static void main(String[] args) {

        // Creating a SortedSet using TreeSet
        SortedSet<Integer> s = new TreeSet<>();

        // add()
        s.add(50);
        s.add(20);
        s.add(40);
        s.add(10);
        s.add(30);

        System.out.println("SortedSet: " + s);

        // first()
        System.out.println("First element: " + s.first());

        // last()
        System.out.println("Last element: " + s.last());

        // headSet()
        System.out.println("HeadSet: " + s.headSet(40));

        // tailSet()
        System.out.println("TailSet: " + s.tailSet(30));

        // subSet()
        System.out.println("SubSet: " + s.subSet(20, 50));

        // comparator()
        Comparator<? super Integer> comp = s.comparator();

        System.out.println("Comparator: " + comp);
    }
}
SortedSet: [10, 20, 30, 40, 50]
First element: 10
Last element: 50
HeadSet: [10, 20, 30]
TailSet: [30, 40, 50]
SubSet: [20, 30, 40]
Comparator: null
