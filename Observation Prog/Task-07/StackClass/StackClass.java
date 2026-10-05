package javacore;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        // push(E item)
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("After push(): " + stack);

        // peek()
        System.out.println("Top element: " + stack.peek());

        // search(Object o)
        System.out.println("Position of B: " + stack.search("B"));

        // pop()
        System.out.println("Popped element: " + stack.pop());
        System.out.println("After pop(): " + stack);

        // empty()
        System.out.println("Is stack empty? " + stack.empty());

        // pop remaining elements
        stack.pop();
        stack.pop();

        System.out.println("After removing all elements: " + stack);
        System.out.println("Is stack empty? " + stack.empty());
    }
}
