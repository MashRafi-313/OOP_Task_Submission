package org.problem1;

import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("The number is a positive integer.");
            } else {
                System.out.println("The number is not a positive integer.");
            }

            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }

        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }
}
