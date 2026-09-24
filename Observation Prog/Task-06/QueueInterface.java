package javacore;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {

    public static void main(String[] args) {

        // Creating a Queue using LinkedList
        Queue<String> q = new LinkedList<>();

        // add()
        q.add("Apple");
        q.add("Banana");
        q.add("Mango");

        System.out.println("Queue: " + q);

        // offer()
        q.offer("Orange");
        System.out.println("After offer: " + q);

        // element()
        System.out.println("Head element: " + q.element());

        // peek()
        System.out.println("Peek element: " + q.peek());

        // remove()
        System.out.println("Removed element: " + q.remove());
        System.out.println("After remove: " + q);

        // poll()
        System.out.println("Polled element: " + q.poll());
        System.out.println("After poll: " + q);

        // Checking the head element again
        System.out.println("Current head: " + q.peek());
    }
}
Queue: [Apple, Banana, Mango]
After offer: [Apple, Banana, Mango, Orange]
Head element: Apple
Peek element: Apple
Removed element: Apple
After remove: [Banana, Mango, Orange]
Polled element: Banana
After poll: [Mango, Orange]
Current head: Mango
