package javacore;
import java.util.PriorityQueue;

class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(30);
        q.add(10);
        q.add(20);

        System.out.println(q);
        System.out.println("Peek: " + q.peek());
        System.out.println("Poll: " + q.poll());
        System.out.println("Contains 20: " + q.contains(20));
        System.out.println("Size: " + q.size());

        q.remove(20);
        System.out.println(q);
    }
}
