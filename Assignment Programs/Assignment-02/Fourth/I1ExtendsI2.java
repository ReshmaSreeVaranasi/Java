package javacore;

interface I2 {
    void add();
}

interface I1 extends I2 {
    void mul();
}

class C1 implements I1 {

    public void add() {
        System.out.println("Addition = 5");
    }

    public void mul() {
        System.out.println("Multiplication = 6");
    }

    public static void main(String[] args) {

        C1 c = new C1();

        c.add();
        c.mul();
    }
}
