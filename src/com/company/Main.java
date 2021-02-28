package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println( "Hey hey people, Sseth here!" );

        Human human1 = new Human( "Jan", "Malinski", "Java Dev", 6000);
        Human human2 = new Human( "Wojtek", "Krawczyk", "Front-End Dev", 5500 );

        Animal animal1 = new Animal( "Gutek", 15, 3, "cat" );
        Animal animal2 = new Animal("Loui",  40, 8, "dog" );

        Phone phone1 = new Phone( "Motorola", 0.25, 1500.0 );
        Phone phone2 = new Phone( "Samsung", 0.3, 2214.23 );

        System.out.println(human1);
        System.out.println(phone2);
        System.out.println(animal1);

        if (animal1.weight > animal2.weight){
            System.out.println(animal1.name + " jest ciezszy od " + animal2.name + ".");
            System.out.println("Waga " + animal1.name + " to " + animal1.weight + "kg.");
        } else {
            System.out.println(animal2.name + " jest ciezszy od " + animal1.name + ".");
            System.out.println("Waga " + animal2.name + " to " + animal2.weight + "kg.");

        }

    }
}

