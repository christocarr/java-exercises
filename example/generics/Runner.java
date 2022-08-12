package example.generics;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		Cage<String> cage = new Cage<>();
		Steel steel = new Steel("Some carbon");
		
		cage.setObject(steel.getType());
		
		String a = cage.getObject();
		System.out.println(a);
	}

}
