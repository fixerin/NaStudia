package com.company;

public class Animal {
    String name;
    private Double weight;
    int age;
    final String species;

    public static final Double DEFAULT_CAT_WEIGHT = 5.0;
    public static final Double DEFAULT_DOG_WEIGHT = 15.0;
    public static final Double DEFAULT_BIRD_WEIGHT = 0.6;
    public static final Double DEFAULT_WEIGHT = 10.0;

    public Animal(String name, int age, String species) {
        this.name = name;
        if (species.equals( "cat" )){
            this.weight = DEFAULT_CAT_WEIGHT;
        } else if (species.equals( "dog" )){
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals( "bird" )){
            this.weight = DEFAULT_BIRD_WEIGHT;
        } else {
            this.weight = DEFAULT_WEIGHT;
        }
//        this.weight = weight;
        this.age = age;
        this.species = species;
    }

    void feed(){
        if (weight > 0.0){
            weight += 1.0;
            System.out.println("Nakarmiono " + name + ". Waga: " + weight);
        } else {
            System.out.println("Martwego zwierzaka niestety nie nakarmisz.");
        }
    }

    void takeForAWalk(){
        if (weight > 0.0) {
            weight -= 1.0;
            System.out.println("Wyprowadzono " + name + " na spacer. Waga: " + weight);
        } else {
            System.out.println("Martwego zwierzaka niestety nie nakarmisz.");
        }

    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
