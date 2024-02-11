package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********Calculadora**********");
        Scanner scanner = new Scanner(System.in);
        Multiplicacion multiplicacion = new Multiplicacion(0, 0);
        Division division = new Division(0, 0);
        Potenciacion potenciacion = new Potenciacion(0, 0);
        Raiz raiz = new Raiz(0, 0);
        double temp;


        while (true) {
            System.out.println("Opciones:");
            System.out.println("0. Salir");
            System.out.println("1. Multiplicación");
            System.out.println("2. División");
            System.out.println("3. Potencia");
            System.out.println("4. Raíz");
            System.out.print(": ");
            int option = scanner.nextInt();
            if (option == 0) {
                break;
            }
            while (!(option == 1 || option == 2 || option == 3 || option == 4)) {
                System.out.println("Ingrese una opción válida");
                option = scanner.nextInt();
            }
            switch (option) {
                case 1:
                    System.out.print("Num 1: ");
                    temp = scanner.nextDouble();
                    multiplicacion.setNum1(temp);
                    System.out.print("Num 2: ");
                    temp = scanner.nextDouble();
                    multiplicacion.setNum2(temp);
                    System.out.printf("Resultado: %.2f\n", multiplicacion.operacion());
                    break;
                case 2:
                    System.out.print("Num 1: ");
                    temp = scanner.nextDouble();
                    division.setNum1(temp);
                    System.out.print("Num 2: ");
                    temp = scanner.nextDouble();
                    division.setNum2(temp);
                    System.out.printf("Resultado: %.2f\n", division.operacion());
                    break;
                case 3:
                    System.out.print("Num 1: ");
                    temp = scanner.nextDouble();
                    potenciacion.setNum1(temp);
                    System.out.print("Num 2: ");
                    temp = scanner.nextDouble();
                    potenciacion.setNum2(temp);
                    System.out.printf("Resultado: %.2f\n", potenciacion.operacion());
                    break;
                case 4:
                    System.out.print("Num 1: ");
                    temp = scanner.nextDouble();
                    raiz.setNum1(temp);
                    System.out.print("Num 2: ");
                    temp = scanner.nextDouble();
                    raiz.setNum2(temp);
                    System.out.printf("Resultado: %.2f\n", raiz.operacion());
                    break;
            }
            System.out.println("---------------");
        }
    }
}
