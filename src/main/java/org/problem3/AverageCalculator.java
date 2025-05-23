package org.problem3;

public class AverageCalculator {
    public static void main(String[] args) {
        double[] numbers = {10.5, 20.0, 30.5, 40.0, 50.5};  // sample values
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
