package Matriz;
import java.util.Scanner;
public class Matriz3x3Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);	
        int contador = 1;
        System.out.print("Ingrese el numero de filas");
        int fila = sc.nextInt();
        System.out.print("Ingrese el numero de columnas");
        int columna = sc.nextInt();
        
        int m[][] = new int [fila][columna];
        //bucle para filas
		for(int i=0; i< fila;i++) {
			//bucle para las columnas
			for (int j = 0; j < columna; j++) {
			
			m[i][j] = contador;
			contador++;
			System.out.print("[" + m[i][j] + "] ");
		   }
		System.out.println(" ");
		} 
		
		
	   }
	
	
	
	}


