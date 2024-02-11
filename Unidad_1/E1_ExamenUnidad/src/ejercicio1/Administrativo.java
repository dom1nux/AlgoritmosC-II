package ejercicio1;

import java.util.Scanner;

public class Administrativo extends Persona {
    private String area;

    public Administrativo(String nombre, double sueldo, String area) {
        super(nombre, sueldo);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void registrar() {
        super.registrar();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese el área (%s): ", getClass().getSimpleName());
        String temp = scanner.nextLine();
        setArea(temp);
    }

    @Override
    public void consultar() {
        super.consultar();
        System.out.printf("Área: %s\n", getArea());
    }
}
