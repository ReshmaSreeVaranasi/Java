
package javacore;

import java.util.Scanner;

public class ValidParentheses {

    public static boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        // Check each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push opening brackets into the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            }

            // Check closing brackets
            else {
                // No opening bracket is available
                if (top == -1) {
                    return false;
                }

                char open = stack[top--];

                // Check whether brackets match
                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }

        // Valid only if no opening brackets remain
        return top == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brackets: ");
        String s = sc.nextLine();

        if (isValid(s)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }

        sc.close();
    }
}
/*
output
Enter brackets: ()
Valid
*/
