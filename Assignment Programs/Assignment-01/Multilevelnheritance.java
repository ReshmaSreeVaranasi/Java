package javacore;
class Grandparent {
    void displayGrandparent() {
        System.out.println("This is the grandparent class");
    }
}

class Parent extends Grandparent {
    void displayParent() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is the child class");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Child c = new Child();

       c.displayGrandparent();
       c.displayParent();
       c.displayChild();
    }
}
