package javacore;

import java.util.Scanner;

public class IllegalStateException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            sc.close();

            System.out.println(sc.nextInt());
        }
        catch (IllegalStateException e) {
            System.out.println("Illegal State Exception");
        }

        System.out.println("Program ended");
    }
}
