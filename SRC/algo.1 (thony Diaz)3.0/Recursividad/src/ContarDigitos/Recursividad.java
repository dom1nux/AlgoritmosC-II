package ContarDigitos;

public class Recursividad {
   public int ContarDigitos (int n) {
	   int res;
	   if(n<10) {
		   res = 1;
	   }
	   else {res = 1 + ContarDigitos(n);
	   }	   
	  
	   return(1); 
   }
  
}
