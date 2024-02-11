import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = 0;
        while (arraySize <= 0) {
            System.out.print("Ingrese el número de notas: ");
            arraySize = scanner.nextInt();
        }
        int[] scores = new int[arraySize];
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Ingrese la nota %d: ", i + 1);
            scores[i] = scanner.nextInt();
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Nota %d: %d\n", i + 1, scores[i]);
        }
    }
}