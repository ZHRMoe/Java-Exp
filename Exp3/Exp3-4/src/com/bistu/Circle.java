package com.bistu;

/**
 * Created by ZHRMoe on 15/4/10.
 */
public class Circle {

    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius *Math.PI;
    }

}
