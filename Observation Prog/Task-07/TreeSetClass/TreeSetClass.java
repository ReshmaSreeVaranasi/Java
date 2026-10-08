package javacore;
import java.util.TreeSet;

class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();

        t.add(30);
        t.add(10);
        t.add(20);
        t.add(40);

        System.out.println(t);
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.higher(20));
        System.out.println(t.lower(20));
        System.out.println(t.ceiling(25));
        System.out.println(t.floor(25));

        t.remove(20);
        System.out.println(t);
    }
}
