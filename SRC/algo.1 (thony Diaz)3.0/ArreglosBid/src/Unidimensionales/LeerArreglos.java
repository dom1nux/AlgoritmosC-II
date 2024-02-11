package Unidimensionales;
import java.util.Scanner; 
public class LeerArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		//Hasta quí es el primer ejercicio para el manual (ingresando número a número)
		System.out.println("Numero de elementos: ");
		int n = sc.nextInt();
		int [] v = new int [n];

		// para generar mi vector con random (reemplazamos el leer por generar)
		for (int i = 0 ; i < v.length; i++) {
			v[i]= (int)(Math.random()*50);
		}



		//leer vector (tenemos que eliminar el leer para usarlo en el segundo ejercicio (con random)
		//for (int i = 0 ; i < v.length; i++) {
		//System.out.print("v[" +  (i+1) + "]= "); 
		//v[i] = sc.nextInt();
		//}


		// mostrar vector
		for (int g = 0 ; g < v.length; g++) {
			System.out.print( v[g] +"\t"); 
		}
		//(aquí termina el ´primer ejercico


		//

		//verificar por que sale "0" en la consola ( deberia salir numeros aleatorios
	}

}
