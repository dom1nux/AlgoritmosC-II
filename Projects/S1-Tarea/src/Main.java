import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de datos: ");
        int size = scanner.nextInt();
        int[] storage = new int[size];

        // Data input logic
        for (int i = 0; i < storage.length; i++) {
            System.out.printf("Ingrese el dato #%d: ", i + 1);
            storage[i] = scanner.nextInt();
        }

        // Sorting type selection logic
        System.out.println();
        System.out.println("1. Ordenar de forma ascendente");
        System.out.println("2. Ordenar de forma descendente");
        System.out.print("Ingrese una opción: ");
        int option = scanner.nextInt();
        while (!(option == 1 || option == 2)) {
            System.out.println("Error, ingrese una opción valida: ");
            option = scanner.nextInt();
        }

        switch (option) {
            case 1:
                ascendingSort(storage);
                break;
            case 2:
                descendingSort(storage);
                break;
            default:
                System.out.println("Error");
        }

        // Printing logic
        System.out.println();
        for (int i : storage) {
            System.out.println(i);
        }
    }

    private static void descendingSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void ascendingSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}