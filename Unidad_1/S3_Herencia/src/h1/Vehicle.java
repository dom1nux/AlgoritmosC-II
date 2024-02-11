package h1;

public class Vehicle {
    public String numPlate;
    public String color;
    public String brand;
    public String model;

    public Vehicle(String numPlate, String color, String brand, String model) {
        this.numPlate = numPlate;
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    public void accelerate() {
        System.out.println("El vehiculo esta acelerando");
    }

    public void brake() {
        System.out.println("El vehiculo esta frenando");
    }
    public void changeMarch() {
        System.out.println("El vehiculo esta cambiando de marcha");
    }
}
