package circle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("", 0);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del círculo: ");
        c1.setName(scanner.nextLine());
        System.out.print("Ingrese el radio del circulo: ");
        c1.setRadius(scanner.nextInt());
        System.out.println();
        System.out.printf("Área: %.2f", c1.area());
        System.out.printf("Circunferencia: %.2f", c1.circumference());
        scanner.close();
    }
}
