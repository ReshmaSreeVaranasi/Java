package javacore;
class Parent {
    void displayParent() {
        System.out.println("This is the parent class");
    }
}

class Child1 extends Parent {
    void displayChild1() {
        System.out.println("This is Child 1");
    }
}

class Child2 extends Parent {
    void displayChild2() {
        System.out.println("This is Child 2");
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {

        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        c1.displayParent();
        c1.displayChild1();

        c2.displayParent();
        c2.displayChild2();
    }
}
