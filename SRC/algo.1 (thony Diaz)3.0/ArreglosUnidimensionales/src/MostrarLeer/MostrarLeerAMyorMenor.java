package MostrarLeer;
import java.util.Scanner;
public class MostrarLeerAMyorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sd = new Scanner(System.in);
			System.out.print("ingrese el N° de elemntos:");
			int n = sd.nextInt();
			int[] leer = new int [n];
			for (int i = 0; i <n ; i++) {
				System.out.println("Ingrese el valor de elemto " + (i+1) + ";");
				int t = sd.nextInt();
				 leer[i] = t;}
			for (int x = 0 ; x < n ; x++) {
				System.out.println(leer[x]);}
	}

}
