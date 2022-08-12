package examples.openclosed;

public class Runner {

	public static void main(String[] args) {
		
		Greeting formalGreeting = new FormalGreeting();
		
		Greeter greeter = new Greeter(formalGreeting);
		
		System.out.println(greeter.greet());
	}

}
