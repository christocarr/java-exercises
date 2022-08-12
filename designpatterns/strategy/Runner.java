package designpatterns.strategy;

public class Runner {
	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new EnglishStrategy());
		System.out.println(context.translate());
	}
}
