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

interface Child2 {
    void displayChild2();
}

class GrandChild extends Child1 implements Child2 {

    public void displayChild2() {
        System.out.println("This is Child 2");
    }

    void displayGrandChild() {
        System.out.println("This is the grandchild class");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        GrandChild obj = new GrandChild();

        obj.displayParent();
        obj.displayChild1();
        obj.displayChild2();
        obj.displayGrandChild();
    }
}
