package sobrecarga;

public class Auto {
    float price = 0;
    String brand = "";

    int passengerNumber = 1;

    public Auto(float price, String name, int passengerNumber) {
        this.price = price;
        this.brand = name;
        this.passengerNumber = passengerNumber;
    }

    public void show() {
        System.out.printf("Precio: %.2f\n", price);
        System.out.printf("Marca: %s\n", brand);
    }
}