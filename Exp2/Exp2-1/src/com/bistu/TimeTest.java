package com.bistu;

/**
 * Created by ZHR-rMBP on 15/4/8.
 */
public class TimeTest {

    public static void main(String[] args) {
        Time newTime1 = new Time();
        Time newTime2 = new Time(555550000);
        Time newTime3 = new Time(19, 24, 36);

        System.out.println("Time 1 is " + newTime1.getTime());
        System.out.println("Time 2 is " + newTime2.getTime());
        System.out.println("Time 3 is " + newTime3.getTime());
        newTime1.setTime(555550000);
        System.out.println("New Time 1 is " + newTime1.getHour() + ":" + newTime1.getMinute() + ":" + newTime1.getSecond());
    }
}
