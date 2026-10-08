package javacore;

public class ArrayStoreException {
    public static void main(String[] args) {

        Object[] arr = new String[2];

        try {
            arr[0] = "Hello";
            arr[1] = 10;
        }
        catch (ArrayStoreException e) {
            System.out.println("Cannot store Integer in String array");
        }

        System.out.println("Program ended");
    }
}
