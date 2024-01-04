package Herencia1;

public class Car extends Vehicle {
    private int passengerNumber;

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public Car(String numPlate, String color, String brand, String model, int passengerNumber) {
        super(numPlate, color, brand, model);
        setPassengerNumber(passengerNumber);
    }

    public void driveStyle() {
        System.out.println();
        System.out.println("Bienvenido al auto de Tony Stark");
        System.out.println("Por favor conduzca con cuidado");
        System.out.println("En caso de accidente, se desplegara un traje de auxilio");
        System.out.println("No se asuste y disfrute de su viaje");
        System.out.println();
        System.out.printf("Numero de placa: %s\n", numPlate);
        System.out.printf("Marca: %s\n", brand);
        System.out.printf("Modelo: %s\n", model);
        System.out.printf("Color: %s\n", color);

    }
}
