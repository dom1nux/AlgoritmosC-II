package ejercicio1;

import java.util.Scanner;

public class Persona {
    // Atributos
    private String nombre;
    private double sueldo;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Constructor
    public Persona(String nombre, double sueldo) {
        setNombre(nombre);
        setSueldo(sueldo);
    }

    // Métodos
    public void registrar() {
        Scanner scanner = new Scanner(System.in); 
        System.out.printf("Ingrese el nombre (%s): ", getClass().getSimpleName());
        String temp = scanner.nextLine();
        setNombre(temp);
    }

    public void consultar() {
        System.out.println(getClass().getSimpleName());
        System.out.printf("Nombre: %s\n", getNombre());
        System.out.printf("Sueldo: S/ %.2f\n", getSueldo());
    }

    public void sueldo() {
        Scanner scanner = new Scanner(System.in);
        if (!getClass().getSimpleName().equals("Docente")) {
            System.out.printf("Ingrese el sueldo (%s): ", getClass().getSimpleName());
            int temp = scanner.nextInt();
            setSueldo(temp);
        }
    }
}
