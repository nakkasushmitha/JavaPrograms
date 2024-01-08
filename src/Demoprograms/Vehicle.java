
class Vehicle1 {
    private String make;
    private int year;

    // Parameterized constructor in the Vehicle class
    public Vehicle1(String make, int year) {
        this.make = make;
        this.year = year;
        System.out.println("Vehicle constructor called");
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle1 {
    private String model;

    // Parameterized constructor in the Car class
    public Car(String make, int year, String model) {
        super(make, year);  // Constructor chaining to call the superclass constructor
        this.model = model;
        System.out.println("Car constructor called");
    }

    public String getModel() {
        return model;
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, "Camry");

        // Accessing properties from both Vehicle and Car
        System.out.println("Car details: Make - " + myCar.getMake() + ", Year - " + myCar.getYear() + ", Model - " + myCar.getModel());
    }
}

