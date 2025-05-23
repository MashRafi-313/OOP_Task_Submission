package org.problem3;

public class ReverseSeries {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        for (int j : original) {
            System.out.print(j + " ");
        }

        System.out.println("\nReversed Array:");
        for (int i = 0; i <= original.length / 2; i++) {
            int temp = original[i];
            original[i] = original[original.length - 1 - i];
            original[original.length - 1 - i] = temp;
        }

        System.out.println("Reversed Array:");
        for (int j : original) {
            System.out.print(j + " ");
        }

    }
}

