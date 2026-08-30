package javacore;

class C2 {
    int a = 10;

    C2() {
        System.out.println("C2 constructor called");
    }

    void displayC2() {
        System.out.println("Value of a = " + a);
    }
}

class C1 extends C2 {
    int b = 20;

    C1() {
        super();
        System.out.println("C1 constructor called");
    }

    void displayC1() {
        System.out.println("Value of b = " + b);
        System.out.println("Sum = " + (a + b));
    }
}

public class Program1 {
    public static void main(String[] args) {

        C1 c = new C1();

        c.displayC2();
        c.displayC1();
    }
}
