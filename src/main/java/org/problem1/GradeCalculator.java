package org.problem1;

import java.util.Scanner;

public class GradeCalculator {

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A+";
        } else if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "A-";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 40) {
            return "C+";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score (0 - 100): ");
        if (scanner.hasNextInt()) {
            int score = scanner.nextInt();

            if (score >= 0 && score <= 100) {
                String grade = calculateGrade(score);
                System.out.println("Your grade is: " + grade);
            } else {
                System.out.println("Invalid score. Please enter a number between 0 and 100.");
            }

        } else {
            System.out.println("Invalid input. Please enter a numeric score.");
        }

        scanner.close();
    }
}

