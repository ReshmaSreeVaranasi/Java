package javacore;
class Parent {
    void displayParent() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is the child class");
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {

        Child c = new Child();

        c.displayParent();
        c.displayChild();
    }
}
