package org.problem3;

import java.util.Scanner;

public class MedalWinner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter letter grade (as GPA, e.g., 3.5): ");
        double grade = scanner.nextDouble();

        System.out.print("Has the student completed the semester? (yes/no): ");
        String completed = scanner.next();

        if (grade >= 3.5) {
            if (completed.equalsIgnoreCase("yes")) {
                System.out.println("Student receives a medal.");
            } else {
                System.out.println("No medal — semester not completed.");
            }
        } else {
            System.out.println("No medal — grade below 3.5.");
        }

        scanner.close();
    }
}

