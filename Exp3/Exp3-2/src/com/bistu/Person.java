package com.bistu;

/**
 * Created by ZHR-rMBP on 15/4/9.
 */
public class Person {

    private String name;
    private String address;
    private String tel;
    private String email;

    public Person() {

    }

    public Person(String name, String address, String tel, String email) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.email = email;
    }

    public String toString() {
        return "Name: " + this.name + "\nAddress: " + this.address + "\nTel: " + this.tel + "\nE-mail: " + this.email;
    }

}
