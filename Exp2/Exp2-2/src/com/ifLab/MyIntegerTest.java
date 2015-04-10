package com.ifLab;

/**
 * Created by ZHR-rMBP on 15/4/8.
 */

public class MyIntegerTest {

    public static void main(String[] args) {
        MyInteger integer1 = new MyInteger(40);
        MyInteger integer2 = new MyInteger(89);
        System.out.println("The value in integer1 is " + integer1.getValue());
        System.out.println("The value in integer1 is even or not " + integer1.isEven());
        System.out.println("The value in integer1 is odd or not " + integer1.isOdd());
        System.out.println("The value in integer1 is prime or not " + integer1.isPrime());
        System.out.println("The number 7 is even or not " + MyInteger.isEven(7));
        System.out.println("The number 7 is odd or not " + MyInteger.isOdd(7));
        System.out.println("The number 7 is prime or not " + MyInteger.isPrime(7));
        System.out.println("The integer1 is even or not " + MyInteger.isEven(integer1));
        System.out.println("The integer1 is odd or not " + MyInteger.isOdd(integer1));
        System.out.println("The integer1 is prime or not " + MyInteger.isPrime(integer1));
        System.out.println("The value in integer1 is equal to 40 or not " + integer1.equals(40));
        System.out.println("The value in integer1 is equal to that in integer2 or not " + integer1.equals(integer2));
        String str = "12345";
        char []array = str.toCharArray();
        System.out.println("The char array has transformed as integer to " + MyInteger.parseInt(array));
        System.out.println("The String " + str + " has transformed as integer to " + MyInteger.parseInt(str));
    }
}
