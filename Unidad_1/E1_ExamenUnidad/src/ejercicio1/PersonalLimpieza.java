package ejercicio1;

import java.util.Scanner;

public class PersonalLimpieza extends Persona {
    private String turno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public PersonalLimpieza(String nombre, double sueldo, String turno) {
        super(nombre, sueldo);
        this.turno = turno;
    }

    @Override
    public void registrar() {
        super.registrar();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese el turno (%s): ", getClass().getSimpleName());
        System.out.println("1. Turno mañana");
        System.out.println("2. Turno tarde");
        int tempInt = scanner.nextInt();
        while (!(tempInt == 1 || tempInt == 2)) {
            System.out.print("Ingrese una opción válida: ");
            tempInt = scanner.nextInt();
        }
        if (tempInt == 1) {
            setTurno("Mañana");
        } else {
            setTurno("Tarde");
        }
    }

    @Override
    public void consultar() {
        super.consultar();
        System.out.printf("Turno: %s\n", getTurno());
    }
}
