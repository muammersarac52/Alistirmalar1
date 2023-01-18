package nn;

public class HondaAccord extends Vehicle {



    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord(){

    }
    public HondaAccord(int price){
    this.price = price;
    }
    public HondaAccord(int price, int year){
    this.price = price;
    this.year = year;
        System.out.println("hondaaccord");
    }
    public HondaAccord(int price, int year, String make,String model){
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;
    }


}
