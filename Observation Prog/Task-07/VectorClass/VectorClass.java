package javacore;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        // add(E e)
        v.add("A");
        v.add("B");
        v.add("C");
        System.out.println("After add(): " + v);

        // addElement(E obj)
        v.addElement("D");
        System.out.println("After addElement(): " + v);

        // get(int index)
        System.out.println("Element at index 2: " + v.get(2));

        // set(int index, E element)
        v.set(2, "X");
        System.out.println("After set(2, X): " + v);

        // remove(int index)
        v.remove(1);
        System.out.println("After remove(1): " + v);

        // removeElement(Object obj)
        v.removeElement("D");
        System.out.println("After removeElement(D): " + v);

        // size()
        System.out.println("Size: " + v.size());

        // capacity()
        System.out.println("Capacity: " + v.capacity());

        // contains(Object o)
        System.out.println("Contains A: " + v.contains("A"));
        System.out.println("Contains B: " + v.contains("B"));
    }
}
