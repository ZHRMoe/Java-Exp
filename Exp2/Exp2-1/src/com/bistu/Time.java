package com.bistu;
/**
 * Created by ZHR-rMBP on 15/4/8.
 */
public class Time {
    
    private long hour, minute, second;

    public void calculateCurrentTime(long timeMillIs) {
        long totalSeconds = timeMillIs / 1000;
        long currentSecond = timeMillIs % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        this.hour = currentHour;
        this.minute = currentMinute;
        this.second = currentSecond;
    }

    public Time() {
        long totalMileSeconds = System.currentTimeMillis();
        calculateCurrentTime(totalMileSeconds);
    }

    public Time(long timeMillIs) {
        calculateCurrentTime(timeMillIs);
    }

    public Time(long nHour, long nMinute, long nSecond) {
        this.hour = nHour;
        this.minute = nMinute;
        this.second = nSecond;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        calculateCurrentTime(elapseTime);
    }

    public String getTime() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }
}
