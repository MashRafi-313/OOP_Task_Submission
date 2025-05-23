package org.problem4;

import java.util.Scanner;

public class StringOperations {
    private String str;

    public StringOperations(String str) {
        this.str = str;
    }

    // Method to reverse the string
    public String reverse() {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Method to check if the string is a palindrome
    public boolean isPalindrome() {
        return str.equals(reverse());
    }

    // Method to count occurrence of a character
    public int countChar(char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();

        StringOperations ops = new StringOperations(inputStr);

        System.out.println("Reversed string: " + ops.reverse());
        System.out.println("Is palindrome: " + ops.isPalindrome());

        System.out.print("Enter a character to count: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Occurrence of '" + ch + "': " + ops.countChar(ch));

        scanner.close();
    }
}

