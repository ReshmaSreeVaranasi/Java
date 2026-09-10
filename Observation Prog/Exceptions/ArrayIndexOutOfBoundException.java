package javacore;

public class ArrayIndexExample {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30};

        try {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }

        System.out.println("Program ended");
    }
}
