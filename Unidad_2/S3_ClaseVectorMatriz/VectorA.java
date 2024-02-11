import java.util.Scanner;
import java.util.Vector;

public class VectorA {
    public static void main(String[] args) {
        int x = 0;
        int p = 0;
        char status = 'y';
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> a = new Vector<>();
        
        System.out.println();
        while (status == 'y') {
            System.out.print("Ingrese un número: ");
            x = scanner.nextInt();

            do {
                System.out.print("Ingrese la posición: ");
                p = scanner.nextInt(); 
            } while (p < 0);

            if (p < 0 || p > a.size()) {
                a.addElement(x);
            } else {
                a.add(p, x);
            }

            System.out.printf("a[%d]: %d\n", a.indexOf(x), x);

            System.out.print("¿Continuar? (y): ");
            status = scanner.next().charAt(0);
        }
        p = 0;
        System.out.println();
        for (Integer integer : a) {
            System.out.printf("a[%d]: %d\n", a.indexOf(integer), integer);
            p++;
        }
        scanner.close();
    } 
}
