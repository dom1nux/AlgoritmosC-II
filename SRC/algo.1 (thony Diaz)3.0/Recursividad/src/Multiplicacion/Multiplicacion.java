package Multiplicacion;

public class Multiplicacion {
   public int Multipli (int multiplicand, int multiplicad) {
	   int rpta = 0 ;
	   
	   if (multiplicad == 0 ) {
		   return rpta;
   }
	   
		  for (int i = 1; i <= multiplicad; i++) {
			  
			  rpta = rpta + multiplicand;
			  System.out.print(multiplicand + "+" + "=");
		  }
		 return rpta;
	
}
   
}