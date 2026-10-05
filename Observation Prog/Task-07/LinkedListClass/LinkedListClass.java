package javacore;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // add(E e)
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("After add(): " + list);

        // addFirst(E e)
        list.addFirst("X");
        System.out.println("After addFirst(): " + list);

        // addLast(E e)
        list.addLast("Y");
        System.out.println("After addLast(): " + list);

        // get(int index)
        System.out.println("Element at index 2: " + list.get(2));

        // getFirst()
        System.out.println("First element: " + list.getFirst());

        // getLast()
        System.out.println("Last element: " + list.getLast());

        // remove(int index)
        list.remove(2);
        System.out.println("After remove(2): " + list);

        // remove(Object o)
        list.remove("B");
        System.out.println("After remove(\"B\"): " + list);

        // removeFirst()
        list.removeFirst();
        System.out.println("After removeFirst(): " + list);

        // removeLast()
        list.removeLast();
        System.out.println("After removeLast(): " + list);

        // offer(E e)
        list.offer("Z");
        System.out.println("After offer(): " + list);

        // peek()
        System.out.println("peek(): " + list.peek());

        // poll()
        System.out.println("poll(): " + list.poll());
        System.out.println("After poll(): " + list);
    }
}
