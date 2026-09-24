package javacore;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

    public static void main(String[] args) {

        // Creating a NavigableMap using TreeMap
        NavigableMap<Integer, String> m = new TreeMap<>();

        // put()
        m.put(10, "Apple");
        m.put(20, "Banana");
        m.put(30, "Mango");
        m.put(40, "Orange");
        m.put(50, "Grapes");

        System.out.println("NavigableMap: " + m);

        // lowerKey()
        System.out.println("Lower Key of 30: " + m.lowerKey(30));

      
        System.out.println("Floor Key of 30: " + m.floorKey(30));

        
        System.out.println("Ceiling Key of 35: " + m.ceilingKey(35));

        System.out.println("Higher Key of 30: " + m.higherKey(30));

        
        System.out.println("First Entry: " + m.firstEntry());

       
        System.out.println("Last Entry: " + m.lastEntry());

        // pollFirstEntry()
        System.out.println("Removed First Entry: " + m.pollFirstEntry());
        System.out.println("After pollFirstEntry: " + m);

        // pollLastEntry()
        System.out.println("Removed Last Entry: " + m.pollLastEntry());
        System.out.println("After pollLastEntry: " + m);

        // descendingMap()
        System.out.println("Descending Map: " + m.descendingMap());
    }
}
NavigableMap: {10=Apple, 20=Banana, 30=Mango, 40=Orange, 50=Grapes}
Lower Key of 30: 20
Floor Key of 30: 30
Ceiling Key of 35: 40
Higher Key of 30: 40
First Entry: 10=Apple
Last Entry: 50=Grapes
Removed First Entry: 10=Apple
After pollFirstEntry: {20=Banana, 30=Mango, 40=Orange, 50=Grapes}
Removed Last Entry: 50=Grapes
After pollLastEntry: {20=Banana, 30=Mango, 40=Orange}
Descending Map: {40=Orange, 30=Mango, 20=Banana}
