import java.util.Scanner;
import java.util.Vector;

public class Vector2 {
    public static void main(String[] args) {
        Vector<Integer> b = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        int num;
        char quit = 'y';
        while (quit == 'y') {
            System.out.print("Ingresa un valor: ");
            num = scanner.nextInt();
            b.add(num);
            System.out.print("¿Continuar? (y/n): ");
            quit = scanner.next().charAt(0);
        }

        System.out.println("Valor a buscar dentro del vector b:");
        int x = scanner.nextInt();
        if (b.contains(x)) {
            System.out.printf("El vector b contiene el número %d en el índice [%d]\n", x, b.indexOf(x));
        } else {
            System.out.printf("El vector b no contiene el número %d\n", x);
        }
        scanner.close();
    }
}
