package javacore;

public class ClassCastException {
    public static void main(String[] args) {

        Object value = "Hello";

        try {
            Integer number = (Integer) value;
            System.out.println(number);
        }
        catch (ClassCastException e) {
            System.out.println("Class Cast Exception");
        }

        System.out.println("Program ended");
    }
}
