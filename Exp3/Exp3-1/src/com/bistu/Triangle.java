package com.bistu;

/**
 * Created by ZHR-rMBP on 15/4/9.
 */
public class Triangle extends GeometricObject {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double newSide1, double newSide2, double newSide3) {
        this.side1 = newSide1;
        this.side2 = newSide2;
        this.side3 = newSide3;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    public String toString() {
        return  "Created on " + this.getDateCreated() + "\nColor: " + this.getColor() + " and filled " + this.isFilled() + "\nThe triangle has 3 sides, the length of them are " + this.getSide1() + ", " + this.getSide2() + " and " + this.getSide3() + "." + "\nThe area of it is " + this.getArea() + " and the perimeter of it is " + this.getPerimeter() + ".";
    }

}
