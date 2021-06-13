package com.company;

public class Animal implements Saleable{
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
        if (species.equals( "kot" )){
            this.weight = DEFAULT_CAT_WEIGHT;
        } else if (species.equals( "pies" )){
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals( "ptak" )){
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

//    @Override
//    public void sell(Human seller, Human buyer, Double cash) {
//        System.out.println("Implement me!");
//    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception( "Human trading is prohibited!" );
        } else {
            if (buyer.getCash() >= price) {
                if (seller.pet == this) {

                    System.out.println("Buyer's pet : " + buyer.pet);
                    System.out.println("Seller's pet : " + seller.pet);

                    buyer.pet = this;
                    seller.pet = null;

                    buyer.setCash( buyer.getCash() - price );
                    seller.setCash( seller.getCash() + price );

                    System.out.println("Buyer's pet : " + buyer.pet);
                    System.out.println("Seller's pet : " + seller.pet);
                } else {
                    throw new Exception( "Seller doesnt have that pet." );
                }
            } else {
                throw new Exception( "Buyer doesnt have enough cash." );
            }
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + name +
                ", weight='" + weight + '\'' +
                ", age=" + age +
                '}';
    }
}
