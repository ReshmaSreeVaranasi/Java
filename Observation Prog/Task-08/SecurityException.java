package javacore;

public class SecurityExample {
    public static void main(String[] args) {

        try {
            throw new SecurityException();
        }
        catch (SecurityException e) {
            System.out.println("Security Exception");
        }

        System.out.println("Program ended");
    }
}
