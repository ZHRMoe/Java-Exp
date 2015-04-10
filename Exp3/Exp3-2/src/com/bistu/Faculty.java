package com.bistu;

/**
 * Created by ZHR-rMBP on 15/4/9.
 */
public class Faculty extends Employee {

    private String workTime;
    private String level;

    public Faculty() {

    }

    public Faculty(String name, String address, String tel, String email,String office, String salary, MyDate startDate, String  workTime, String level) {
        super(name, address, tel, email, office, salary, startDate);
        this.workTime = workTime;
        this.level = level;
    }

    public String toString() {
        return super.toString() + "\nWorkTime: " + this.workTime + "\nLevel: " + this.level;
    }
}
