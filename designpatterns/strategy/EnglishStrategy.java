package designpatterns.strategy;

public class EnglishStrategy implements Strategy {

	@Override
	public String speak() {
		return "Hello";
	}
	
}
