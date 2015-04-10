package com.bistu;

/**
 * Created by ZHR-rMBP on 15/4/9.
 */
public class MyDate {

    private int year, month, day;

    public MyDate() {

    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getDate() {
        return this.year + "-" + this.month + "-" + this.day;
    }
}
