package org.lab5;

import junit.framework.TestCase;

import org.lab5.student.Student;
import org.lab5.student.Grad_Student;

public class SchoolTest extends TestCase {
    public void testStudentObject() {
        String[] courses = {"Math", "English", "Science"};
        assertEquals(courses[0], "Math");
    }

    public void testGrad_StudentObject() {
        String[] courses = {"Math", "English", "Science", "History"};
        assertEquals(courses[0], "Math");
    }

    public void testStudentInfo() {
        String[] courses = {"Math", "English", "Science"};
        int[] grades = {90, 80, 70};
        Student student = new Student("John", 20, 3, courses, grades);
        assertEquals(student.getName(), "John");
    }

    public void testGrad_StudentInfo() {
        String[] courses = {"Math", "English", "Science", "History"};
        int[] grades = {90, 80, 70, 60};
        Grad_Student grad_student = new Grad_Student("John", 20, 4, courses, grades,
                "Dr. Smith", "The History of the World");
        assertEquals(grad_student.getName(), "John");
    }


}
