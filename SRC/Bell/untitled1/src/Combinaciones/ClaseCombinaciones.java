package Combinaciones;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClaseCombinaciones {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int x = 2;
        List<List<Integer>> combinaciones = encontrarCombinaciones(array, x);

        for (List<Integer> combinacion : combinaciones) {
            System.out.println(combinacion);
        }
    }
    public static List<List<Integer>> encontrarCombinaciones(int[] array, int x) {
        List<List<Integer>> result = new ArrayList<>();
        encontrarCombinacionesRecursivo(array, x, 0, new ArrayList<>(), result);
        return result;
    }
    private static void encontrarCombinacionesRecursivo(int[] array, int x, int indice, List<Integer> combinacionActual, List<List<Integer>> result) {
        if (combinacionActual.size() == x) {
            result.add(new ArrayList<>(combinacionActual));
            return;
        }
        for (int i = indice; i < array.length; i++) {
            combinacionActual.add(array[i]);
            encontrarCombinacionesRecursivo(array, x, i + 1, combinacionActual, result);
            combinacionActual.remove(combinacionActual.size() - 1);
        }
    }
}