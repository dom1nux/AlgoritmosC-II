package InvertirNum;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el numero: ");
      int numero = sc.nextInt();
      Invertir rec = new Invertir ();
       int invertirNumero = rec.invertirNumero (numero);
       System.out.println("numero invertido "+invertirNumero );
	}
}
