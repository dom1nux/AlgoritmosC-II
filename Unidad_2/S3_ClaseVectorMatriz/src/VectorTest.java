import java.util.Scanner;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector <Integer> b = new Vector<>();
        char status = 'y';
        do {
            System.out.print("Ingrese un número: ");
            b.addElement(scanner.nextInt());
            System.out.print("¿Continuar? (y): ");
            status = scanner.next().charAt(0);
        } while (status == 'y');
        scanner.close();
        int counter = 1;
        System.out.println();
        for (Integer integer : b) {
            System.out.printf("b[%d]: %d\n", counter, integer);
            counter++;
        }
    }
}
