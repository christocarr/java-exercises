package examples.exceptions;

public class Maths {
	public int divide(int a, int b) {
		try {
			if(a < b) {
				throw new DivisorTooBigException();
			}
			int c = a / b;
			return c;
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero");
		} catch(DivisorTooBigException e) {
			System.out.println(a +" is smaller than " + b);
		} catch(Exception e) {
			System.out.println("Other exception");
		}
		
		return 0;
	}
}
