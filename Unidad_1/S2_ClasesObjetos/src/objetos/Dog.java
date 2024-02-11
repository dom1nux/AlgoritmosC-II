package objetos;

import java.util.Scanner;

public class Dog {
    String name;
    String race;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "Fido";
        dog1.race = "Pequines";
        dog2.name = "Rulos";
        dog2.race = "Cocker";

        Dog dog3 = new Dog();
        System.out.print("Ingrese nombre del perro: ");
        dog3.name = scanner.nextLine();
        System.out.print("Ingrese raza del perro: ");
        dog3.race = scanner.nextLine();

        System.out.println("Perro 1:");
        System.out.printf("- Nombre: %s\n", dog1.name);
        System.out.printf("- Raza: %s\n", dog1.race);
        System.out.println("Perro 2:");
        System.out.printf("- Nombre: %s\n", dog2.name);
        System.out.printf("- Raza: %s\n", dog2.race);
        System.out.println("Perro 3:");
        System.out.printf("- Nombre: %s\n", dog3.name);
        System.out.printf("- Raza: %s\n", dog3.race);
        scanner.close();
    }
}