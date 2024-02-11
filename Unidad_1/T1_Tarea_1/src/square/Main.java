package square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Square square1 = new Square("", 0);
        System.out.print("Ingrese el nombre del cuadrado: ");
        square1.setName(scanner.nextLine());
        System.out.print("Ingrese la longitud de los lado: ");
        square1.setSideLength(scanner.nextDouble());

        square1.show();
        scanner.close();
    }

}
