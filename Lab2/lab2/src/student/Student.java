package student;

import java.util.Arrays;

public class Student {
    protected String name;
    protected int age;
    protected int num_of_courses;
    protected String[] courses;
    protected int[] grades;

    public Student(String name, int age, int num_of_courses, String[] courses, int[] grades) {
        this.name = name;
        this.age = age;
        this.num_of_courses = num_of_courses;
        this.courses = courses;
        this.grades = grades;
    }
    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number of courses: " + num_of_courses);
        System.out.println("Courses: " + Arrays.toString(courses));
        System.out.println("Grades: " + Arrays.toString(grades));
    }
}
