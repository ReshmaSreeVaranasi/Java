package javacore;

public class NullPointerException {
    public static void main(String[] args) {

        String str = null;

        try {
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }

        System.out.println("Program ended");
    }
}
