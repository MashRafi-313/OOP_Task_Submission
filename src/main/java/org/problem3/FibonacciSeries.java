package org.problem3;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + ", " + b);

        while (true) {
            int next = a + b;
            if (next > 89) break;

            System.out.print(", " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}

