package Perro;
import java.util.Scanner; //Clase
public class Perro {
    String nombre;
    String raza;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Declarando
        Perro perro1 = new Perro(); //Declarando
        Perro perro2 = new Perro(); //Declarando
        Perro perro3 = new Perro(); //Declarando

        perro1.nombre="Fido";
        perro1.raza="Pequines";
        perro2.nombre="Rulos";
        perro2.raza="Coquer";

        System.out.println("PERRO1");
        System.out.println("Nombre:" + perro1.nombre + "Raza:" + perro1.raza);
        System.out.println("PERRO2");
        System.out.println("Nombre:" + perro2.nombre + "Raza:" + perro2.raza);

        System.out.println("PERRO3");
        System.out.println("Nombre de perro:");
        perro3.nombre = sc.next();

        System.out.println("Raza de perro:");
        perro3.raza = sc.next();
        System.out.println("Nombre"+ perro3.nombre + "Raza:" + perro3.raza);
    }
}