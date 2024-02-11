package Euclides;

import java.util.Scanner;

public class ClaseAlgoritmoEuclides {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número: ");
            int num2 = scanner.nextInt();

            int mcd = calcularMCD(num1, num2);

            System.out.println("El Máximo Común Divisor de " + num1 + " y " + num2 + " es: " + mcd);

            scanner.close();
        }

        public static int calcularMCD(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return calcularMCD(b, a % b);
            }
        }
    }