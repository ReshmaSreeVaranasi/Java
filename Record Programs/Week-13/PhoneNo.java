
package javacore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneNumber {
    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        // Return empty list if input is empty
        if (digits.length() == 0) {
            return result;
        }

        // Mapping digits to letters
        String[] phone = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        // Start with an empty combination
        result.add("");

        // Process each digit
        for (int i = 0; i < digits.length(); i++) {
            String letters = phone[digits.charAt(i) - '0'];
            List<String> temp = new ArrayList<>();

            // Combine existing strings with each letter
            for (String s : result) {
                for (int j = 0; j < letters.length(); j++) {
                    temp.add(s + letters.charAt(j));
                }
            }

            result = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits: ");
        String digits = sc.next();

        System.out.println(letterCombinations(digits));

        sc.close();
    }
}
/*
output
Enter digits: 23
[ad, ae, af, bd, be, bf, cd, ce, cf]
  */
