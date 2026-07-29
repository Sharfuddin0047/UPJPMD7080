package lab5;

import java.util.ArrayList;

/*
	
Assignment 1: Student Management System
Question
Create a Java program to manage student information using Classes, Objects, and Constructors.

Requirements:
1. Create a class named Student.
2. The class should contain the following attributes:
    - Student ID
    - Student Name
    - Course
    - Marks
3. Create a parameterized constructor to initialize all the attributes.
4. Create the following methods:
    - displayDetails() – to display all student information.
    - isPassed() – to check whether the student has passed or failed. (Passing marks = 40)
5. In the main() method:
    - Create three Student objects.
    - Display the details of all students.
    - Print whether each student has passed or failed.

## Bonus Challenge: Display the student who has scored the highest marks.
*/
public class Student {

    int studentID;
    String studentName;
    String course;
    float marks;

    Student() {
    }

    Student(int studentId, String studentName, String course, float marks) {
        this.studentID = studentId;
        this.studentName = studentName;
        this.course = course;
        this.marks = marks;
    }

    public String displayDetails() {
        return "[ID: " + studentID + ", Name: " + studentName + ", Course: " + course + ", Marks: " + marks + "]";
    }

    public boolean isPassed() {
        return this.marks >= 40;
    }

    public static String getMaxMarks(ArrayList<Student> list) {
        if (list.isEmpty()) {
            return "No students in the list.";
        }
        float max = Float.MIN_VALUE;
        Student student = null;
        for (Student s : list) {
            if (s.marks > max) {
                max = s.marks;
                student = s;
            }
        }
        return "[ID: " + student.studentID + ", Name: " + student.studentName + ", Course: " + student.course
                + ", Marks: " + student.marks + "]";
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student(1234, "Raman", "BCA", 30);
        list.add(s1);
        Student s2 = new Student(5678, "Priya", "B.Tech", 75);
        list.add(s2);
        Student s3 = new Student(9101, "Amit", "MCA", 55);
        list.add(s3);
        Student s4 = new Student(1121, "Sneha", "B.Sc", 39);
        list.add(s4);

        System.out.println(s1.displayDetails());
        System.out.println(s1.studentName + " Passed: " + s1.isPassed());
        System.out.println(
                "==================================================================================================");

        System.out.println(s2.displayDetails());
        System.out.println(s2.studentName + " Passed: " + s2.isPassed());
        System.out.println(
                "==================================================================================================");

        System.out.println(s3.displayDetails());
        System.out.println(s3.studentName + " Passed: " + s3.isPassed());
        System.out.println(
                "==================================================================================================");

        System.out.println(s4.displayDetails());
        System.out.println(s4.studentName + " Passed: " + s4.isPassed());
        System.out.println(
                "==================================================================================================");

        // Bonus Challenge
        System.out.println("Student Who Scored max Marks is : ");
        System.out.println(getMaxMarks(list));
    }

}
