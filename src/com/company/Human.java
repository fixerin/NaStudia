package com.company;

import devices.Car;
import devices.Phone;

import java.util.Date;

public class Human extends Animal {
    String firstName, lastName;
    String position;
    Double salary;
    Double cash;
    Integer age;
    Animal pet;
    private Car car;
    private Phone phone;
    public static final  String HUMAN_SPECIES = "homo sapiens";



    public Human(Double weight, String firstName, String lastName, String position, Double salary, Double cash, Integer age) {
        super(firstName, age, HUMAN_SPECIES);
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.cash = cash;
//        this.age = age;
    }

//    public Human(String firstName, String lastName, String java_dev, double v1, double v, short age) {
//        super(firstName, age, "Homosapiens");
//        this.firstName = firstName;
//        this.lastName = lastName;
////        this.age = age;
//    }

    public Double getSalary() {
        System.out.println(new Date() + ": Salary data recived, salary is " + salary);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0 ) {
            System.out.println( "Salary can't be negative value." );
        } else {
            this.salary = salary;
            System.out.println("New salary is " + salary);
            System.out.println("You have to recive annex from ms. Hania from Kadr.");
            System.out.println("Your salary is no secret for ZUS and US.");
        }
    }

    public Car getCar() {
        return car;
    }

//    public void setCar(Car car) {
//        if (salary > car.value) {
//            System.out.println("You bought your new car with cash.");
//            this.car = car;
//        } else if (salary > car.value / 12) {
//            System.out.println("You bought your new car with credit loan.");
//            this.car = car;
//        } else {
//            System.out.println("Search for new job or ask for promotion. You can't afford it.");
//        }
//    }


    public void setCar(Car car) {
        this.car = car;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }
}
