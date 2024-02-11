package Tarea_3;
import java.util.Scanner;
public class General_Main {
    public static void main(String[] args) {
        Scanner Ss = new Scanner(System.in);
        System.out.println("Con que problema quieres interactuar?");
        System.out.println("1. Barajeador de cartas");
        System.out.println("2. Suma");
        System.out.println("3. Multiplicación");
        System.out.println("4. Transpuesta");
        System.out.print(": ");
        int Call = Ss.nextInt();

        switch (Call){
            case 1:
                Case1();
                break;
            case 2:
                Case2();
                break;
            case 3:
                Case3();
                break;
            case 4:
                Case4();
                break;
            default:
                System.out.println("Error");
        }

    }

    private static void Case2() {
        Suma_Matr_Main.Main_1();
    }
    private static void Case1() {
        Barajeador_cartas.Main_2();
    }
    private static void Case3() {
        Multiplicacion_Matr.Main_3();
    }
    private static void Case4() {
        Transpuesta.Main_4();
    }

}
