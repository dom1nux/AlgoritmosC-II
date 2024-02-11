import java.util.Scanner;

public class LeerMostrarSintetizado {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Ingrese el número de variables");
        int E = SC.nextInt();
        int[] Arr = new int[E];
        for (int i = 0; i < E; i++) {
            System.out.println("Ingresa el numero " + (i + 1) + ":");
            int F = SC.nextInt();
            Arr[i] = F;
        }
        for (int o = 0; o < E; o++) {
            System.out.println(Arr[o]);

        }
    }
}
