package com.bistu;

/**
 * Created by ZHRMoe on 15/4/10.
 */
public class CourseTest {

    public static void main(String[] args) {
        Course course = new Course("Java");
        for (int i = 1; i <= 10; ++i) {
            course.addStudent(String.format("Student%d", i));
        }
        System.out.println("Step 1:We initialized 10 students into the ArrayList.");
        System.out.println("Course Name: " + course.getCourseName() + "\nNumber of students: " + course.getNumberOfStudents() + "\nStudents List: " + course.getStudents());
        for (int i = 1; i <= 5; ++i) {
            course.dropStudent(String.format("Student%d",i));
        }
        System.out.println("\nStep 2:We removed 5 students from the ArrayList.");
        System.out.println("Course Name: " + course.getCourseName() + "\nNumber of students: " + course.getNumberOfStudents() + "\nStudents List: " + course.getStudents());
    }
}
