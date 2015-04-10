package com.bistu;

/**
 * Created by ZHRMoe on 15/4/10.
 */
public class GeometricObjectTest {

    public static void main(String[] args) {
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(5);
        System.out.println("The area of Circle1 is " + circle1.getArea() + " and the Circle2 is: " + circle2.getArea());
        System.out.println("The bigger one between Circle1 and Circle2 is: " + circle1.compareTo(circle2));
        System.out.println("1 refers to Circle1, -1 refers to Circle2, 0 refers to two circles has same area.\n");
        Rectangle rectangle1 = new Rectangle(6, 7);
        Rectangle rectangle2 = new Rectangle(4, 3);
        System.out.println("The area of Rectangle1 is " + rectangle1.getArea() + " and the Rectangle2 is: " + rectangle2.getArea());
        System.out.println("The bigger one between Rectangle1 and Rectangle2 is: " + rectangle1.compareTo(rectangle2));
        System.out.println("1 refers to Rectangle1, -1 refers to Rectangle2, 0 refers to two rectangles has same area.\n");
        Rectangle rectangle3 = new Rectangle(4, 9);
        Rectangle rectangle4 = new Rectangle(6, 6);
        System.out.println("The area of Rectangle3 is " + rectangle3.getArea() + " and the Rectangle4 is: " + rectangle4.getArea());
        System.out.println("The bigger one between Rectangle3 and Rectangle4 is: " + rectangle3.compareTo(rectangle4));
        System.out.println("1 refers to Rectangle3, -1 refers to Rectangle4, 0 refers to two rectangles has same area.");
    }
}
