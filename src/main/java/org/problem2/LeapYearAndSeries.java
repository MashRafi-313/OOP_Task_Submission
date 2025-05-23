package org.problem2;

import java.util.Scanner;

public class LeapYearAndSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check Leap Year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        System.out.println("\nEven Numbers (2–20) using For Loop:");
        int sumEvenFor = 0;
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
            sumEvenFor += i;
        }
        System.out.println("\nSum = " + sumEvenFor);

        System.out.println("\nOdd Numbers (1–19) using While Loop:");
        int i = 1;
        int sumOddWhile = 0;
        while (i < 20) {
            System.out.print(i + " ");
            sumOddWhile += i;
            i += 2;
        }
        System.out.println("\nSum = " + sumOddWhile);

        System.out.println("\nEven Numbers (2–20) using Do-While Loop:");
        int j = 2;
        int sumEvenDo = 0;
        do {
            System.out.print(j + " ");
            sumEvenDo += j;
            j += 2;
        } while (j <= 20);
        System.out.println("\nSum = " + sumEvenDo);

        System.out.println("\nOdd Numbers (1–19) using For Loop:");
        int sumOddFor = 0;
        for (int k = 1; k < 20; k += 2) {
            System.out.print(k + " ");
            sumOddFor += k;
        }
        System.out.println("\nSum = " + sumOddFor);

        System.out.println("\nEven Numbers (2–20) using While Loop:");
        int m = 2;
        int sumEvenWhile = 0;
        while (m <= 20) {
            System.out.print(m + " ");
            sumEvenWhile += m;
            m += 2;
        }
        System.out.println("\nSum = " + sumEvenWhile);

        System.out.println("\nOdd Numbers (1–19) using Do-While Loop:");
        int n = 1;
        int sumOddDo = 0;
        do {
            System.out.print(n + " ");
            sumOddDo += n;
            n += 2;
        } while (n < 20);
        System.out.println("\nSum = " + sumOddDo);

        scanner.close();
    }
}

