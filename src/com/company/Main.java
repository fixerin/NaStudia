package com.company;

import devices.Car;
import devices.Phone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        System.out.println( "Hey hey people, Sseth here!" );

        Human human1 = new Human( 60.0, "Jan", "Malinski", "Java Dev", 6000.0, 20000.0,41);
        Human human2 = new Human( 75.0, "Wojtek", "Krawczyk", "Front-End Dev", 5500.0, 60000.0, 29 );
        Human human3 = new Human( 58.7, "Ania", "Wojtasik", "Actor", 4000.0, 6000.2, 33 );

        Animal animal1 = new Animal( "Gutek", 2,  "kot" );
        Animal animal2 = new Animal("Loui",  5,  "pies" );

        Phone phone1 = new Phone( "Motorola", "A45", 2016, 0.25, 1500.0 );
        Phone phone2 = new Phone( "Samsung", "G30", 2018, 0.3, 2214.23 );

        System.out.println(human1);
        System.out.println(phone2);
        System.out.println(animal1);

        if (animal1.getWeight() > animal2.getWeight()){
            System.out.println(animal1.name + " jest ciezszy od " + animal2.name + ".");
            System.out.println("Waga " + animal1.name + " to " + animal1.getWeight() + "kg.");
        } else {
            System.out.println(animal2.name + " jest ciezszy od " + animal1.name + ".");
            System.out.println("Waga " + animal2.name + " to " + animal2.getWeight() + "kg.");
        }


        Animal animalMaxWeight = animal1.getWeight() > animal2.getWeight() ? animal1 : animal2;


        StringBuilder animaldesc = new StringBuilder( animal1.name + " jest ciezszy od " ).
                append( animal1.name + "." ).
                append( " Waga " + animal2.name + " to " + animal2.getWeight() + "kg." );

        System.out.println(animaldesc);

        ArrayList<Human> humanList = new ArrayList<>(  );
        humanList.add( human1 );
        humanList.add( human2 );
        humanList.add( human3 );


        for (Human human : humanList){
            System.out.println(human.firstName + " jest w wieku " + human.age);
//            System.out.println(human.age);
        }

        human1.pet = animal1;

        System.out.println(human1.firstName + " ma nowego " + human1.pet.species +". Wabi się " + human1.pet.name + ".");

//        animal1.feed();
//        animal1.feed();
//        animal1.takeForAWalk();
//        animal1.takeForAWalk();
//        animal1.takeForAWalk();
//        animal1.takeForAWalk();
//        animal1.takeForAWalk();
//        animal1.takeForAWalk();
//        animal1.takeForAWalk();
//        animal1.takeForAWalk();
//
//        human1.getSalary();
//        human1.setSalary( -1040.0 );
//        human1.setSalary( 6100.0 );
//
//
//        human2.setSalary( 60000.0 );
        Car car1 = new Car( "A4", "Audi", 2018, "black", 0, 36000.0 );

        human2.setCar( car1 );
        //System.out.println(human2.firstName + " now have " + human2.getCar().producer + ". It's yearbook is " + human2.getCar().yeabook + ".");

        Car carTest = new Car( "B2", "BMW", 2021, "grey", 0,203000.0 );
        carTest.turnOn();
        phone1.turnOn();
        System.out.println( carTest );
        System.out.println( phone1 );

//        car1.sell( human1, human2, human1.cash );

        human2.getCar().sell( human2, human1, 20000.0 );

        System.out.println("------------------------------------------------------------");

        human1.setPhone( phone1 );
        human1.getPhone().sell( human1, human2, phone1.getPrice() );


        System.out.println("------------------------------------------------------------");
        human1.pet.sell( human1, human2, 323.3 );
    }
}

