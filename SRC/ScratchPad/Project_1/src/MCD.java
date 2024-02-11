import java.util.Scanner;

public class MCD {
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        System.out.printf("El MCD de %d y %d es: %d\n", a, b, mcd(a, b));
        scanner.close();
    }
}
