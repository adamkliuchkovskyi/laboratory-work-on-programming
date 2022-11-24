package org.lab5.student;

public class Grad_Student extends Student {
    private String supervisor;
    private String thesis_title;

    public Grad_Student(String name, int age, int num_of_courses, String[] courses, int[] grades, String supervisor, String thesis_title) {
        super(name, age, num_of_courses, courses, grades);
        this.supervisor = supervisor;
        this.thesis_title = thesis_title;
    }

    public void info() {
        super.info();
        System.out.println("Supervisor: " + supervisor);
        System.out.println("Thesis title: " + thesis_title);
    }
}
