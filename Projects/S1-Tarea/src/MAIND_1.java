//CLASE CUADRADOOO
import java.util.Scanner;
public class MAIND_1 {
    public static void main(String[] args) {
     Scanner sc =  new Scanner(System.in);
     CUADRADO d1 = new CUADRADO("", 0);
      System.out.println("ingrese el nombre: ");
      d1.setNombre(sc.nextLine());
        System.out.println("ingrese el lado: ");
        d1.setLado(sc.nextDouble());

      d1.mostrar();

    }

}
