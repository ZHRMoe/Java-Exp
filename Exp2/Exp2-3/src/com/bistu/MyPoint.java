package com.bistu;

/**
 * Created by ZHR-rMBP on 15/4/8.
 */
public class MyPoint {
    
    private int X, Y;

    public MyPoint() {
        this.X = 0;
        this.Y = 0;
    }

    public MyPoint(int newX, int newY) {
        this.X = newX;
        this.Y = newY;
    }

    public int getX() {
        return this.X;
    }

    public int getY() {
        return this.Y;
    }

    public String getPoint() {
        return "(" + this.X + "," + this.Y + ")";
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        double dis = Math.sqrt((p1.X - p2.X) * (p1.X - p2.X) + (p1.Y - p2.Y) * (p1.Y - p2.Y));
        return dis;
    }
    
    public double distance(MyPoint point) {
        double dis = Math.sqrt((this.X - point.X) * (this.X - point.X) + (this.Y - point.Y) * (this.Y - point.Y));
        return dis;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double dis = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return dis;
    }
    
    public double distance(int x, int y) {
        double dis = Math.sqrt((x - this.X) * (x - this.X) + (y - this.Y) * (y - this.Y));
        return dis;
    }

}
