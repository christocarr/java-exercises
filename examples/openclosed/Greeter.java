package examples.openclosed;

public class Greeter {

	private Greeting greeting;
	
	public Greeter(Greeting greeting) {
		this.greeting = greeting;
	}
	
	public String greet() {
		return greeting.greet();
	}
}
