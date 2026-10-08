package javacore;

public class NegativeArraySizeException{
    public static void main(String[] args) {

        try {
            int size = -5;

            int arr[] = new int[size];

            System.out.println("Array created");
        }
        catch (NegativeArraySizeException e) {
            System.out.println("Array size can't be negative");
        }

        System.out.println("Program is continued...");
    }
}
