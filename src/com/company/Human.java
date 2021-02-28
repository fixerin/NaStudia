package com.company;

import java.util.Date;

public class Human {
    String firstName, lastName;
    String position;
    int salary;
    short age;

    public Human(String firstName, String lastName, String position, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public Human(String firstName, String lastName, short age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}
