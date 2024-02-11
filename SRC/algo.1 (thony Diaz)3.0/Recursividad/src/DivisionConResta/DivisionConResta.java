package DivisionConResta;

public class DivisionConResta {

	public int dividir (int dividendo, int divisor) {

		int rpta;
		if (divisor == 0) {
			rpta = -1;
		}
		if (dividendo<divisor) {
			rpta =0;
		}
		else {
			dividendo = dividendo - divisor;
			rpta = 1+dividir (dividendo, divisor);

		}
		return rpta;
	}
}
