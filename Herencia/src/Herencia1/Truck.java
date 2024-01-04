package Herencia1;

public class Truck extends Vehicle {
    private int passengerNumber;

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
    public Truck(String numPlate, String color, String brand, String model, int passengerNumber) {
        super(numPlate, color, brand, model);
        setPassengerNumber(passengerNumber);
    }

    public void driveStyle() {
        System.out.println();
        System.out.println("Bienvenido al camión inteligente");
        System.out.println("Por favor maneje con cuidado");
        System.out.println("En caso de accidente, llame a la linea de auxilio");
        System.out.println("Disfrute del viaje");
        System.out.println();
        System.out.printf("Numero de placa: %s\n", numPlate);
        System.out.printf("Marca: %s\n", brand);
        System.out.printf("Modelo: %s\n", model);
        System.out.printf("Color: %s\n", color);

    }
}
