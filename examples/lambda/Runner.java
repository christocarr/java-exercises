package examples.lambda;

import java.util.ArrayList;

public class Runner {
	
	private double operate(double a, FunctInterface func) {
		return func.operation(a);
	}

	public static void main(String[] args) {
		//build instance if class that implements runnable interface
		RunnableExample runnableExample = new RunnableExample();
		
		//instantiate an anonymous class
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				
			}
			
		};
		
		//lambda expression
		Runnable r3 = () -> {};
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("John");
		names.add("Sam");
		names.add("Hilary");
		
		names.forEach(n -> System.out.println(n));
		
		FunctInterface fahrenheitToCelsius = (double a) -> (a - 32) * 5/9;
		
		Runner runner = new Runner();
		System.out.println(runner.operate(32, fahrenheitToCelsius));
	}

}
