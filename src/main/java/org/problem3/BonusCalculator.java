package org.problem3;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sales percentage (0–100): ");
        int sales = scanner.nextInt();

        System.out.print("Enter attendance percentage (0–100): ");
        int attendance = scanner.nextInt();

        int bonus;

        if (sales >= 95 && attendance == 100) {
            bonus = 60;
        } else if (sales >= 95 && attendance >= 90) {
            bonus = 40;
        } else if (sales >= 80 && attendance == 100) {
            bonus = 40;
        } else if (sales >= 80 && attendance >= 90) {
            bonus = 20;
        } else {
            bonus = 5;
        }

        System.out.println("Bonus: " + bonus + "%");
        scanner.close();
    }
}

