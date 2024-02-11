package Matriz;

public class Matriz3x3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador =1; 
		int fila = 3;
		int columna= 3;
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
		  
		//m[0][0]=1;
		//m[0][1]=2;
		//m[0][2]=3;
		//m[1][0]=4;
		//m[1][1]=5;
		//m[1][2]=6;
		//m[2][0]=7;
		//m[2][1]=8;
		//m[2][2]=9;
			
		//System.out.print("["+m[0][0]+"]");
		//System.out.print("["+m[0][1]+"]");
		//System.out.println("["+m[0][2]+"]");
		//System.out.print("["+m[1][0]+"]");
		//System.out.print("["+m[1][1]+"]");
		//System.out.println("["+m[1][2]+"]");
		//System.out.print("["+m[2][0]+"]");
		//System.out.print("["+m[2][1]+"]");
		//System.out.print("["+m[2][2]+"]");
	}


