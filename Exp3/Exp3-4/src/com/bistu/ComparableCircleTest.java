package com.bistu;

/**
 * Created by ZHRMoe on 15/4/10.
 */
public class ComparableCircleTest {

    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(5);
        ComparableCircle comparableCircle2 = new ComparableCircle(4);
        ComparableCircle comparableCircle3 = new ComparableCircle(6);
        ComparableCircle comparableCircle4 = new ComparableCircle(5);
        System.out.println("The bigger one between ComparableCircle1 and ComparableCircle2 is: " + comparableCircle1.compareTo(comparableCircle2));
        System.out.println("1 refers to ComparableCircle1, -1 refers to ComparableCircle2, 0 refers to the two circle have the same area.\n");
        System.out.println("The bigger one between ComparableCircle1 and ComparableCircle3 is: " + comparableCircle1.compareTo(comparableCircle3));
        System.out.println("1 refers to ComparableCircle1, -1 refers to ComparableCircle3, 0 refers to the two circle have the same area.\n");
        System.out.println("The bigger one between ComparableCircle1 and ComparableCircle4 is: " + comparableCircle1.compareTo(comparableCircle4));
        System.out.println("1 refers to ComparableCircle1, -1 refers to ComparableCircle4, 0 refers to the two circle have the same area.");
    }
}
