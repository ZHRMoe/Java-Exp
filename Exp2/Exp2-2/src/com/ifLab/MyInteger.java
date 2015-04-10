package com.ifLab;

/**
 * Created by ZHR-rMBP on 15/4/7.
 */
public final class MyInteger {

    private int value;

    public MyInteger(int newValue) {
        this.value = newValue;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isEven() {
        return (this.value % 2 == 0);
    }

    public boolean isOdd() {
        return (! isEven());
    }

    public boolean isPrime() {
        for (int i = 2; i < value / 2; ++i) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int someValue) {
        return (someValue % 2 == 0);
    }

    public static boolean isOdd(int someValue) {
        return (! isEven(someValue));

    }

    public static boolean isPrime(int someValue) {
        for (int i = 2; i < someValue / 2; ++i) {
            if (someValue % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger someInteger) {
        return (someInteger.value % 2 == 0);
    }

    public static boolean isOdd(MyInteger someInteger) {
        return (! isEven(someInteger));
    }

    public static boolean isPrime(MyInteger someInteger) {
        for (int i = 2; i < someInteger.value / 2; ++i) {
            if (someInteger.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int someValue) {
        return (this.value == someValue);
    }

    public boolean equals(MyInteger someInteger) {
        return (someInteger.value == this.value);
    }

    public static int parseInt(char[] array) {
        int right = 1;
        int solve = 0;
        for (int i = array.length - 1; i >= 0; --i) {
            solve = solve + right * ((int)array[i] - 48);
            right *= 10;
        }
        return solve;
    }

    public static int parseInt(String str) {
        char[] array = str.toCharArray();
        return parseInt(array);
    }

}
