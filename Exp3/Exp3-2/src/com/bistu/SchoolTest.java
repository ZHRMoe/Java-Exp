package com.bistu;

/**
 * Created by ZHR-rMBP on 15/4/9.
 */
public class SchoolTest {

    public static void main(String[] args) {
        MyDate newDate = new MyDate(2012, 1, 1);
        Person somePerson = new Person("Oliver", "Beijing", "18611112222", "oliver@gmail.com");
        Student someStudent = new Student("Oliver", "Beijing", "18611112222", "oliver@gmail.com", "Grade 1");
        Employee someEmployee = new Employee("Tim", "Beijing", "13900001111", "tim@gmail.com", "2-217","8000 RMB", newDate);
        Faculty someFaculty = new Faculty("Tim", "Beijing", "13900001111", "tim@gmail.com", "2-217","8000 RMB", newDate, "8:00 AM to 5:00 PM", "Professor");
        Staff someStaff = new Staff("Jane", "Beijing", "15588883333", "jane@gmail.com", "3-211", "5000RMB", newDate, "Manager");
        System.out.println("Person\n" + somePerson.toString() + "\n");
        System.out.println("Student\n" + someStudent.toString() + "\n");
        System.out.println("Employee\n" + someEmployee.toString() + "\n");
        System.out.println("Faculty\n" + someFaculty.toString() + "\n");
        System.out.println("Staff\n" + someStaff.toString() + "\n");


    }
}
