package Arreglos;

import java.util.Scanner;

public class LeerArreglo {
    public static void main(String[] args) {
        Scanner Ss = new Scanner(System.in);

        System.out.println("Número de elementos: ");
        int n = Ss.nextInt();
        int []v = new int[n];

                //Ingresando numero a numero -- 1°ejercicio
        //leer Vector
        for (int i = 0; i < v.length; i++) {
            System.out.print("["+(i+1)+"]: ");
            v[i] = Ss.nextInt();
        }

        // Mostrar el vector
        for (int j : v) {
            System.out.print(j + "\t");
        }
        System.out.println();

                //Ingresando numero a numero -- 2°ejercicio
        //Generar vector con valores random
        for (int g = 0; g < v.length; g++) {
            v[g] =(int)(Math.random()*50);
        }

        //Mostrar Vector
        for (int j : v) {
            System.out.print(j + "\t");
        }
    }
}
