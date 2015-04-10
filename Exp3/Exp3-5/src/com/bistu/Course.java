package com.bistu;

import java.util.ArrayList;

/**
 * Created by ZHRMoe on 15/4/10.
 */

@SuppressWarnings("unchecked")

public class Course {

    private String courseName;
    private ArrayList students = new ArrayList(100);
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(numberOfStudents, student);
        numberOfStudents++;
    }

    public ArrayList getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
        numberOfStudents--;
    }

}
