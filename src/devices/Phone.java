package devices;

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
}
