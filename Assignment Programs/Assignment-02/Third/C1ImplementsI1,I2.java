package javacore;

interface I1 {
    int a = 90;

    void mul();
}

interface I2 {
    int x = 10;

    void add();
}

class C1 implements I1, I2 {

    int b = 2;
    int c = 3;

    @Override
    public void mul() {
        System.out.println("Multiplication = " + (b * c));
    }

    @Override
    public void add() {
        System.out.println("Addition = " + (b + c));
    }

    public static void main(String[] args) {

        C1 obj = new C1();

        obj.mul();
        obj.add();

        System.out.println("Value of a = " + obj.a);
        System.out.println("Value of x = " + obj.x);
    }
}
