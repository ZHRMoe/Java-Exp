package com.bistu;

/**
 * Created by ZHR-rMBP on 15/4/8.
 */
public class MyPointTest {

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("Point1 is at " + p1.getPoint());
        System.out.println("Point2 is at " + p2.getPoint());
        System.out.println("Distance between point1 and point2 is " + MyPoint.distance(p1, p2));
        System.out.println("Distance between point1 and point2 is " + p1.distance(p2));
        System.out.println("Distance between (0,0) and (3,4) is " + MyPoint.distance(0, 0, 3, 4));
        System.out.println("Distance between (0,0) and (3,4) is " + p1.distance(3, 4));

    }
}
