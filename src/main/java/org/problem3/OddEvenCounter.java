package org.problem3;

public class OddEvenCounter {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 9, 14, 5, 8, 3};
        int evenCount = 0, oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}

