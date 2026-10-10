
package number;

public class Roman {

    // Method to convert Roman numerals to integer
    public static int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = 0;

            // Get the value of the current Roman symbol
            switch (s.charAt(i)) {
                case 'I': value = 1; break;
                case 'V': value = 5; break;
                case 'X': value = 10; break;
                case 'L': value = 50; break;
                case 'C': value = 100; break;
                case 'D': value = 500; break;
                case 'M': value = 1000; break;
            }

            // Subtract if the current value is smaller
            // than the next Roman symbol
            if (i + 1 < s.length()) {
                int next = 0;

                switch (s.charAt(i + 1)) {
                    case 'I': next = 1; break;
                    case 'V': next = 5; break;
                    case 'X': next = 10; break;
                    case 'L': next = 50; break;
                    case 'C': next = 100; break;
                    case 'D': next = 500; break;
                    case 'M': next = 1000; break;
                }

                if (value < next) {
                    result -= value;
                } else {
                    result += value;
                }
            } else {
                result += value;
            }
        }

        return result;
    }
}



import java.util.Scanner;
import number.Roman;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the Roman numeral
        System.out.print("Enter Roman numeral: ");
        String s = sc.next();

        // Call the imported method
        int result = Roman.romanToInteger(s);

        // Display the integer value
        System.out.println("Integer value: " + result);

        sc.close();
    }
}
/*output
Enter Roman numeral: LVIII
Integer value: 58
*/
