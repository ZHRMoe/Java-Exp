package com.bistu;

/**
 * Created by ZHR-rMBP on 15/4/9.
 */
public class Staff extends Employee {

    private String title;

    public Staff() {

    }

    public Staff(String name, String address, String tel, String email,String office, String salary, MyDate startDate, String title) {
        super(name, address, tel, email, office, salary, startDate);
        this.title = title;
    }

    public String toString() {
        return super.toString() + "\nTitle: " + this.title;
    }
}
