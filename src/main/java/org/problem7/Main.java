package org.problem7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Alice", "Computer Science");
        Instructor instructor = new Instructor(101, "Dr. Smith", "CS", "Professor");
        Course course = new Course(1001, "Intro to CS Syllabus", "Intro to CS", "3", "None");
        CourseOffering offering = new CourseOffering(student.getId(), instructor.getId(), course.getId(), new Date(), 1, 101, 2025, "SP");

        System.out.println("Course offering created for student: " + student.getName());
    }
}

