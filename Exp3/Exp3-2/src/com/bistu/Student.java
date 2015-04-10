package com.bistu;

/**
 * Created by ZHR-rMBP on 15/4/9.
 */
public class Student extends Person {

    private String grade;

    public Student() {

    }

    public Student(String name, String address, String tel, String email, String grade) {
        super(name, address, tel, email);
        this.grade = grade;
    }

    public String toString() {
        return super.toString() + "\nGrade: " + this.grade;
    }
}
