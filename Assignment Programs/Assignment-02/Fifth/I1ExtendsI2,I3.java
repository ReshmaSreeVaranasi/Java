package javacore;

interface I2 {
    void add();
}

interface I3 {
    void sub();
}

interface I1 extends I2, I3 {
    void mul();
}

class C1 implements I1 {

    public void add() {
        System.out.println("Addition");
    }

    public void sub() {
        System.out.println("Subtraction");
    }

    public void mul() {
        System.out.println("Multiplication");
    }

    public static void main(String[] args) {

        C1 o = new C1();

        o.add();
        o.sub();
        o.mul();
    }
}
