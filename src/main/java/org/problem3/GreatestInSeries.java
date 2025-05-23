package org.problem3;

public class GreatestInSeries {
    public static void main(String[] args) {
        int[] numbers = {15, 42, 8, 67, 33, 91, 23};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Greatest number: " + max);
    }
}
