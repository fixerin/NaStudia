package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println( "Hey hey people, Sseth here!" );

        Human human1 = new Human( "Jan", "Malinski", "Java Dev", 6000);
        Human human2 = new Human( "Wojtek", "Krawczyk", "Front-End Dev", 5500 );

        Animal animal1 = new Animal( 15, 3, "cat" );
        Animal animal2 = new Animal( 40, 8, "dog" );

        Phone phone1 = new Phone( "Motorola", 0.25, 1500.0 );
        Phone phone2 = new Phone( "Samsung", 0.3, 2214.23 );

        System.out.println(human1);
        System.out.println(phone2);
        System.out.println(animal1);

    }
}

