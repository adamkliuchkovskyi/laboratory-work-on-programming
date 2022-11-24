package org.lab5.description;

import org.lab5.student.Grad_Student;
import org.lab5.student.Student;

public class School {
    public static void main(String[] args) {
        String[] courses = {"Math", "English", "Science"};
        int[] grades = {90, 80, 70};
        Student student = new Student("John", 20, 3, courses, grades);
        student.info();
        System.out.println("    ");
        String[] courses2 = {"Math", "English", "Science", "History"};
        int[] grades2 = {90, 80, 70, 60};
        Grad_Student grad_student = new Grad_Student("John", 20, 4, courses2, grades2,
                "Dr. Smith", "The History of the World");
        grad_student.info();
    }
}
