package ejercicio1;

import java.util.Scanner;

public class Docente extends Persona {
    private String cargo;
    private int horasTrabajadas;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Docente(String nombre, double sueldo, String cargo, int horasTrabajadas) {
        super(nombre, sueldo);
        this.cargo = cargo;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void registrar() {
        super.registrar();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese el cargo (%s): ", getClass().getSimpleName());
        String temp = scanner.nextLine();
        setCargo(temp);
    }

    @Override
    public void consultar() {
        super.consultar();
        System.out.printf("Cargo: %s\n", getCargo());
        System.out.printf("Número de horas laboradas: %d\n", getHorasTrabajadas());
        System.out.printf("Sueldo: %.2f\n", getSueldo());
    }

    @Override
    public void sueldo() {
        super.sueldo();
        if (getClass().getSimpleName().equals("Docente")) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el número de horas laboró: ");
            int temp = scanner.nextInt();
            setHorasTrabajadas(temp);
            double sueldo = 50 * getHorasTrabajadas();
            setSueldo(sueldo);
            System.out.printf("El sueldo final es: %.2f\n", getSueldo());
        }
    }
}
