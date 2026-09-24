package javacore;

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {

    public static void main(String[] args) {

        Deque<String> d = new ArrayDeque<>();

        // addFirst()
        d.addFirst("Apple");
        d.addFirst("Banana");
        System.out.println("After addFirst: " + d);

        // addLast()
        d.addLast("Mango");
        d.addLast("Orange");
        System.out.println("After addLast: " + d);

        // offerFirst()
        d.offerFirst("Grapes");
        System.out.println("After offerFirst: " + d);

        // offerLast()
        d.offerLast("Pineapple");
        System.out.println("After offerLast: " + d);

        System.out.println("First element: " + d.peekFirst());

        
        System.out.println("Last element: " + d.peekLast());

        
        System.out.println("Removed first: " + d.removeFirst());
        System.out.println("After removeFirst: " + d);

        
        System.out.println("Removed last: " + d.removeLast());
        System.out.println("After removeLast: " + d);

        System.out.println("Polled first: " + d.pollFirst());
        System.out.println("After pollFirst: " + d);
        System.out.println("Polled last: " + d.pollLast());
        System.out.println("After pollLast: " + d);
    }
}
After addFirst: [Banana, Apple]
After addLast: [Banana, Apple, Mango, Orange]
After offerFirst: [Grapes, Banana, Apple, Mango, Orange]
After offerLast: [Grapes, Banana, Apple, Mango, Orange, Pineapple]
First element: Grapes
Last element: Pineapple
Removed first: Grapes
After removeFirst: [Banana, Apple, Mango, Orange, Pineapple]
Removed last: Pineapple
After removeLast: [Banana, Apple, Mango, Orange]
Polled first: Banana
After pollFirst: [Apple, Mango, Orange]
Polled last: Orange
After pollLast: [Apple, Mango]
