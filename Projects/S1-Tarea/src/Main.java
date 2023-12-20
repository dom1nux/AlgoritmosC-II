import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de datos: ");
        int size = scanner.nextInt();
        int[] store = new int[size];

        // Data input
        for (int i = 0; i < store.length; i++) {
            System.out.printf("Ingrese el dato %d: ", i + 1);
            store[i] = scanner.nextInt();
        }

        // Sorting algorithm
        System.out.println("Ordenar datos: ");
        System.out.println("1. Mayor a menor");
        System.out.println("2. Menor a mayor");
        System.out.print(": ");
        int answer = scanner.nextInt();

        switch (answer) {
            case 1:
                for (int i = 0; i < store.length; i++) {
                    if (i == store.length - 1) {
                        break;
                    } else if (store[i] < store[i + 1]) {
                        int buffer = store[i];
                        store[i] = store[i + 1];
                        store[i + 1] = buffer;
                    }
                }
                for (int j : store) {
                    System.out.println(j);
                }
                break;
            case 2:
                for (int i = 0; i < store.length; i++) {
                    if (i == store.length - 1) {
                        break;
                    } else if (store[i] > store[i + 1]) {
                        int buffer = store[i];
                        store[i] = store[i + 1];
                        store[i + 1] = buffer;
                    }
                }
                for (int j : store) {
                    System.out.println(j);
                }
                break;
            default:
                System.out.println("Ingrese una opción válida");
        }

    }
}