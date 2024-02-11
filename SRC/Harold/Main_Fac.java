package Recursividad;
import java.util.Scanner;
public class Main_Fac {
    public static void main(String[] args) {
        Scanner Ss = new Scanner(System.in);
        Factorial F = new Factorial();

        System.out.println("Ingresa un número");
        int B = Ss.nextInt();

        F.Multiplicacion(B);
        int Factorial = F.Multiplicacion(B);
        System.out.println(B+"! = "+Factorial);
    }
}
