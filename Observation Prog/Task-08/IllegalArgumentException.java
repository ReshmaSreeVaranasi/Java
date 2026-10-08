package javacore;

public class IllegalArgumentException{
    public static void main(String[] args) {

        try {
            Thread.sleep(-100);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument Exception");
        }

        System.out.println("Program ended");
    }
}
