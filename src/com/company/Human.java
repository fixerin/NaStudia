package com.company;

import java.util.Date;

public class Human {
    String firstName, lastName;
    String position;
    int salary;
    int age;
    Animal pet;
    Car car;

    public Human(String firstName, String lastName, String position, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.age = age;
    }

    public Human(String firstName, String lastName, short age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}
