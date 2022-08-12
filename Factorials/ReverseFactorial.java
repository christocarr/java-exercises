package Factorials;

public class ReverseFactorial {

	public static void main(String[] args) {
		
		int numberToFactorial = 120;
		int factorial = numberToFactorial;
		
		for(int i = 2; factorial != i; i++) {
			factorial = factorial / i;
		}
		
		System.out.println(factorial);
	}

}

