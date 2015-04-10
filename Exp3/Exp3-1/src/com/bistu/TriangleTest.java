package com.bistu;

/**
 * Created by ZHR-rMBP on 15/4/9.
 */
public class TriangleTest {

    public static void main(String[] args) {
        Triangle someTriangle = new Triangle(1, 1.5, 1);
        someTriangle.setColor("yellow");
        someTriangle.setFilled(true);
        System.out.println(someTriangle.toString());
    }
}
