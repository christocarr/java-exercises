package Conditionals;

public class FizzBuzz {

  public static void main(String[] args) {
    int num = 2;

    if(num % 3 == 0) {
      System.out.println("Fizz");
    }

    if(num % 5 == 0) {
      System.out.println("Buzz");
    }

    if(num % 3 == 0 && num % 5 == 0) {
      System.out.println("FizzBuzz");
    }

    if(num % 3 != 0 && num % 5 != 0) {
      System.out.println(num);
    }
  }
  
}
