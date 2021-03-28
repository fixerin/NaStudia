package com.company;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println( "Hey hey people, Sseth here!" );

        Human human1 = new Human( "Jan", "Malinski", "Java Dev", 6000, 41);
        Human human2 = new Human( "Wojtek", "Krawczyk", "Front-End Dev", 5500, 29 );
        Human human3 = new Human( "Ania", "Wojtasik", "Actor", 4000, 33 );

        Animal animal1 = new Animal( "Gutek", 2,  "cat" );
        Animal animal2 = new Animal("Loui",  5,  "dog" );

        Phone phone1 = new Phone( "Motorola", 0.25, 1500.0 );
        Phone phone2 = new Phone( "Samsung", 0.3, 2214.23 );

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

        animal1.feed();
        animal1.feed();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();

    }
}

