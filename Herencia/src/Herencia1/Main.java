package Herencia1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car auto1 = new Car("", "", "", "", 0);
        Truck truck1 = new Truck("", "", "", "", 0);
        int passengers;

        System.out.println("Auto");
        System.out.print("Ingrese la placa: ");
        auto1.numPlate = scanner.next();
        System.out.print("Ingrese el color: ");
        auto1.color = scanner.next();
        System.out.print("Ingrese la marca: ");
        auto1.brand = scanner.next();
        System.out.print("Ingrese el modelo: ");
        auto1.model = scanner.next();
        System.out.print("Ingrese el numero de pasajeros: ");
        passengers = scanner.nextInt();
        auto1.setPassengerNumber(passengers);

        auto1.driveStyle();

        System.out.println();
        System.out.println("Camión");
        System.out.print("Ingrese la placa: ");
        truck1.numPlate = scanner.next();
        System.out.print("Ingrese el color: ");
        truck1.color = scanner.next();
        System.out.print("Ingrese la marca: ");
        truck1.brand = scanner.next();
        System.out.print("Ingrese el modelo: ");
        truck1.model = scanner.next();
        System.out.print("Ingrese el numero de pasajeros: ");
        passengers = scanner.nextInt();
        auto1.setPassengerNumber(passengers);

        truck1.driveStyle();
    }
}