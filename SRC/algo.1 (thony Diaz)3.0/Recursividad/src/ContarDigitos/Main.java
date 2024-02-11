package ContarDigitos;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el numero: ");
		int numero = sc.nextInt();
	//____________________________________________________________________
		
		Recursividad rec = new Recursividad();
		  int ContarDigitos = rec.ContarDigitos(numero);
		  System.out.println ("N de digitos: " + ContarDigitos);
		
		
	}

}
