package devices;

import com.company.Human;

public class Phone extends Device{
//    String mark;
    double weight;
    double price;

    public Phone(String producer, String model, Integer yearOfProd, double weight, double price) {
        super(producer, model, yearOfProd);
//        this.mark = mark;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public void turnOn() {
        System.out.println( "Phone is on." );
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

        if (seller.getPhone() != null){
            if (buyer.getCash() >= price ){
                System.out.println("Buyers cash : " + buyer.getCash());
                System.out.println("Seller cash : " + seller.getCash());
                System.out.println("Buyers phone : " + buyer.getPhone());
                System.out.println("Seller phone : " + seller.getPhone());

                System.out.println("Phone's price : " + price);

                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);

                buyer.setPhone( seller.getPhone() );
                seller.setPhone( null );

                System.out.println("Transaction done...");

                System.out.println("Buyers cash : " + buyer.getCash());
                System.out.println("Seller cash : " + seller.getCash());
                System.out.println("Buyers phone : " + buyer.getPhone());
                System.out.println("Seller phone : " + seller.getPhone());
            } else {
                System.out.println("Buyer has not enough cash.");
            }
        } else {
            System.out.println("Seller doesn't have any phone on sell!");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
