package com.bistu;

/**
 * Created by ZHRMoe on 15/4/10.
 */
public class ComparableCircle extends Circle implements Comparable {

    public ComparableCircle() {

    }

    public ComparableCircle(double radius) {
        setRadius(radius);
    }

    public int compareTo(Object o) {
        if (getArea() > ((ComparableCircle)o).getArea()) {
            return 1;
        } else if (getArea() < ((ComparableCircle)o).getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

}
