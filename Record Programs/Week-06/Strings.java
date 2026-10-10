package javacore;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next();

        int maxLength = 0;
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            String temp = "";

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (temp.indexOf(ch) != -1) {
                    break;
                }

                temp = temp + ch;

                if (temp.length() > maxLength) {
                    maxLength = temp.length();
                    longest = temp;
                }
            }
        }

        System.out.println("Length: " + maxLength);
        System.out.println("String: " + longest);

        sc.close();
    }
}
