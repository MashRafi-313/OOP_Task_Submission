package org.problem8.c;

public class CGPACalculator {
    public static void main(String[] args) {
        int numStudents = 5;
        int numSubjects = 5;

        // Credits for each subject
        int[] credits = {3, 4, 2, 3, 3};

        // Grade points already on 4.0 scale
        double[][] gradePoints = {
                {3.7, 4.0, 3.3, 3.7, 4.0}, // Student 1
                {3.3, 3.0, 3.7, 3.3, 3.3}, // Student 2
                {4.0, 3.7, 3.7, 4.0, 4.0}, // Student 3
                {3.0, 3.3, 3.0, 3.3, 3.0}, // Student 4
                {3.7, 4.0, 4.0, 3.7, 3.7}  // Student 5
        };

        for (int i = 0; i < numStudents; i++) {
            double totalWeightedGPA = 0;
            int totalCredits = 0;

            for (int j = 0; j < numSubjects; j++) {
                totalWeightedGPA += gradePoints[i][j] * credits[j];
                totalCredits += credits[j];
            }

            double cgpa = totalWeightedGPA / totalCredits;
            System.out.printf("Student %d CGPA (4.0 scale): %.2f\n", i + 1, cgpa);
        }
    }
}
