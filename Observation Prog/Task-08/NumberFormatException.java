package javacore;

public class NumberFormatException {
    public static void main(String[] args) {

        String value = "100kg";

        try {
            int number = Integer.parseInt(value);
            System.out.println("Number: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }

        System.out.println("Program ended");
    }
}
