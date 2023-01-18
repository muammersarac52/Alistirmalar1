package nn;

public class Car extends Vehicle {

    public String color;
    int km;

    public Car() {

    }

    public Car(String color, int km) {

        this.color = color;
        this.km = km;
        System.out.println("car");
    }
}

