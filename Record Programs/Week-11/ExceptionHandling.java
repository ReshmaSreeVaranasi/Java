package javacore;
import java.util.Scanner;

class MobileNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String n = sc.next();

        try {
            if (n.length() > 10)
                throw new ArrayIndexOutOfBoundsException();

            if (n.length() < 10)
                throw new LengthNotSufficientException();

            for (int i = 0; i < n.length(); i++) {
                if (!Character.isDigit(n.charAt(i)))
                    throw new NumberFormatException();
            }

            System.out.println("Valid number");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Mobile Number-ArrayIndexOutOfBounds Exception");
        }
        catch (LengthNotSufficientException e) {
            System.out.println("Invalid Mobile Number-LengthNotSufficientException");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid Mobile Number-NumberFormatException");
        }
    }
}

class LengthNotSufficientException extends Exception {
}
