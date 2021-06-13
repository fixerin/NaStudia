package devices;

import com.company.Human;
import com.company.Saleable;

public class Car extends Device {
    String model;
    public String producer;
    public int yearbook;
    String color;
    int carsMileage;
    public Double value;

    public Car (String model, String producer, int yearbook, String color, int carsMileage, Double value){
        super(producer, model, yearbook);
//        this.model = model;
//        this.producer = producer;
//        this.yearbook = yearbook;
        this.color = color;
        this.carsMileage = carsMileage;
        this.value = value;
    }


    @Override
    public void turnOn() {
        System.out.println( "Engine starts working.." );
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

        if (seller.getCar() != null){
            if (buyer.getCash() >= price ){
                System.out.println("Buyers cash : " + buyer.getCash());
                System.out.println("Seller cash : " + seller.getCash());
                System.out.println("Buyers car : " + buyer.getCar());
                System.out.println("Seller car : " + seller.getCar());

                System.out.println("Car's price : " + price);

                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);

                buyer.setCar( seller.getCar() );
                seller.setCar( null );

                System.out.println("Transaction done...");

                System.out.println("Buyers cash : " + buyer.getCash());
                System.out.println("Seller cash : " + seller.getCash());
                System.out.println("Buyers car : " + buyer.getCar());
                System.out.println("Seller car : " + seller.getCar());
            } else {
                System.out.println("Buyer has not enough cash.");
            }
        } else {
            System.out.println("Seller doesn't have any car on sell!");
        }
    }
}

