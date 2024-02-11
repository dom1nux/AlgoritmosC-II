package InvertirNum;

public class Invertir {

	// usamos el int porque vamos a retornar una respuesta
	public int invertirNumero (int numero) {
		int rpta = 0;
		return invertirNumero (numero, rpta);

	} 
	public int invertirNumero (int numero, int rpta) {
		if (numero ==0) {
			return rpta;}
		else {
			int residuo = numero/10;
			numero  = numero/10;
			rpta = (rpta*10) + residuo;
			return invertirNumero(numero, rpta);
		}
	}
}
