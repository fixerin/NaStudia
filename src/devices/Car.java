package devices;

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
}

