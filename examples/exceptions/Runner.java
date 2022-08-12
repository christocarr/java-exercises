package examples.exceptions;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Maths maths = new Maths();
		
		maths.divide(2, 0);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		String userInput = sc.next();
//		
//		
//		try {
//			int number = Integer.parseInt(userInput);
//			System.out.println(number);
//			
//		} catch (NumberFormatException e) {
//			System.out.println("Cannot convert to number " + e.getMessage());
//			
//		} finally {
//			System.out.println("Always executed");
//			
//			sc.close();
//		}
	}

}
