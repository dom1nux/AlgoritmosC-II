public class Car {
    float price = 0;
    String brand = "";

    int passengerNumber = 1;

    public Car(float price, String name, int passengerNumber) {
        this.price = price;
        this.brand = name;
        this.passengerNumber = passengerNumber;
    }

    public void show() {
        System.out.printf("Precio: %.2f", price);
        System.out.printf("Marca: %s", brand);
    }
}