package javacore;

interface I1 {
    int a = 90;

    void mul();
}

class C1 implements I1 {

    int b = 2, c = 3;

    @Override
    public void mul() {
        System.out.println("Mul is " + (b * c));
    }

    public static void main(String[] args) {

        C1 c = new C1();

        c.mul();
        System.out.println("Value of a is " + c.a);
    }
}
