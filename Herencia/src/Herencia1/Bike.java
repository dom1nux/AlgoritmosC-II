package Herencia1;

public class Bike extends Vehicle{
    private int passengerNumber;

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
    public Bike(String numPlate, String color, String brand, String model) {
        super(numPlate, color, brand, model);
        setPassengerNumber(passengerNumber);
    }
}
