package Recursividad;

import java.util.Scanner;

public class Main_Dr {
    public static void main(String[] args) {
        Scanner Ss = new Scanner(System.in);
        System.out.println("Ingresa el númerador");
        int n = Ss.nextInt();
        System.out.println("Ingresa el divisor");
        int d = Ss.nextInt();

        D_restas dr = new D_restas();
        dr.Oper(n,d);

    }
}
