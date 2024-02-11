package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Administrativo administrativo1 = new Administrativo("", 0, "");
        Docente docente1 = new Docente("", 0, "", 0);
        PersonalLimpieza personalLimpieza1 = new PersonalLimpieza("", 0, "");

        System.out.println("Administrativo");
        administrativo1.registrar();
        administrativo1.sueldo();
        administrativo1.consultar();

        System.out.println();
        System.out.println("Docente");
        docente1.registrar();
        docente1.sueldo();
        docente1.consultar();

        System.out.println();
        System.out.println("Personal de limpieza");
        personalLimpieza1.registrar();
        personalLimpieza1.sueldo();
        personalLimpieza1.consultar();
        scanner.close();
    }
}
