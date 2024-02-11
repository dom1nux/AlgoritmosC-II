package Factorial;

public class Factorial {

	public int Facto (int n) {
		if ( n > 0 ){
			int valorcalculado = n*Facto(n - 1);
			return valorcalculado;
		}
			return 1;
		
			
	}
}
