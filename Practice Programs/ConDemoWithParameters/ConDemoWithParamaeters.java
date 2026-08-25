package javacore;

public class ConDemoWithParameters {
    int rollNo;
    String name;
    float fee;


    public ConDemoWithParameters(int i, String n, float f) {
        this.rollNo = i;
        this.name = n;
        this.fee = f;
    }

    public void sample() {
        System.out.println("Test method");
        System.out.println("Roll no is: " + this.rollNo);
        System.out.println("Name is: " + this.name);
        System.out.println("Fee is: " + this.fee);
    }

    public static void main(String[] args) {
        System.out.println("Hello CSM D");
        ConDemoWithParameters cd = new ConDemoWithParameters(1234, "ramesh", 234.56F);
        cd.sample();
    }
}
