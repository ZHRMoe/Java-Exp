package com.bistu;

/**
 * Created by ZHR-rMBP on 15/4/9.
 */
public class Employee extends Person {

    private String office;
    private String salary;
    private MyDate startDate;

    public Employee() {

    }

    public Employee(String name, String address, String tel, String email,String office, String salary, MyDate startDate) {
        super(name, address, tel, email);
        this.office = office;
        this.salary = salary;
        this.startDate = startDate;
    }

    public String toString() {
        return super.toString() + "\nOffice: " + this.office + "\nSalary: " + this.salary + "\nStartDate: " + this.startDate.getDate();
    }
}
