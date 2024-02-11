import java.util.Scanner;

import product.MatrixProduct;
import sum.Suma_Matr_Main;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Con que problema quieres interactuar?");
        System.out.println("1. Barajeador de cartas");
        System.out.println("2. Suma");
        System.out.println("3. Multiplicación");
        System.out.println("4. Transpuesta");
        System.out.print(": ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                case1();
                break;
            case 2:
                case2();
                break;
            case 3:
                case3();
                break;
            case 4:
                case4();
                break;
            default:
                System.out.println("Error");
        }
        scanner.close();

    }

    private static void case2() {
        Suma_Matr_Main.Main_1();
    }

    private static void case1() {
        CardShuffler.Main_2();
    }

    private static void case3() {
        MatrixProduct.Main_3();
    }

    private static void case4() {
        Transpose.Main_4();
    }

}
