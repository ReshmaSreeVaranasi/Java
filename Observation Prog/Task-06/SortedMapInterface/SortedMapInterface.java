package javacore;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

    public static void main(String[] args) {

        // Creating a SortedMap using TreeMap
        SortedMap<Integer, String> m = new TreeMap<>();

        // put()
        m.put(50, "Apple");
        m.put(20, "Banana");
        m.put(40, "Mango");
        m.put(10, "Orange");
        m.put(30, "Grapes");

        System.out.println("SortedMap: " + m);

       
        System.out.println("First Key: " + m.firstKey());

       
        System.out.println("Last Key: " + m.lastKey());

        // headMap()
        System.out.println("HeadMap: " + m.headMap(40));

        // tailMap()
        System.out.println("TailMap: " + m.tailMap(30));

        // subMap()
        System.out.println("SubMap: " + m.subMap(20, 50));
    }
}
SortedMap: {10=Orange, 20=Banana, 30=Grapes, 40=Mango, 50=Apple}
First Key: 10
Last Key: 50
HeadMap: {10=Orange, 20=Banana, 30=Grapes}
TailMap: {30=Grapes, 40=Mango, 50=Apple}
SubMap: {20=Banana, 30=Grapes, 40=Mango}
