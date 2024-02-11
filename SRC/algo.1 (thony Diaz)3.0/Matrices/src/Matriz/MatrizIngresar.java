package Matriz;
import java.util.Scanner;
public class MatrizIngresar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner (System.in);	
	        int contador = 0;
	        System.out.print("Ingrese el numero de filas");
	        int fila = sc.nextInt();
	        System.out.print("Ingrese el numero de columnas");
	        int columna = sc.nextInt();
	        
	        int m[][] = new int [fila][columna];
	        //bucle para filas
			for(int i=0; i< fila;i++) {
				//bucle para columnas
				for (int j = 0; j < columna; j++) {
					System.out.print("ingrese el valor para la fila ["+i+"] columna ["+ j +"] :");
					contador = sc.nextInt();
				m[i][j] = contador;
				}
				
			}
           for(int i=0; i< fila;i++) {
				
				for (int j = 0; j < columna; j++) {
				System.out.print("[" + m[i][j] + "] ");
			  
				} 
				System.out.println("");
			}
	}

}
