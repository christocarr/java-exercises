package Arrays;

public class Arrays {
  public static void main(String[] args) {

    //1. Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
    int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    for(int num : numbers1) {
      System.out.println(num);
    }

    System.out.println("-------------------------");

    //2. Create a for loop that populates an integer array  with values, outputting them at each iteration.
    // Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.
    int[] numbers2 = new int[10];
    for(int i = 0; i < 10; i++) {
      numbers2[i] = i;
      System.out.println(numbers2[i]);
    }

    System.out.println("-------------------------");

    for(int num : numbers2) {
      numbers2[num] *= 10;
      System.out.println(numbers2[num]);
    }

    System.out.println("------------------------");

    System.out.println(addDigits("99"));
    
  }

  //NUMBERS
    //1. Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
    
    public static int addDigits(String stringNum) {

      int num = Integer.parseInt(stringNum);
      int digitTotal = 0;

      if(num < 10 || num > 99) {
        System.out.println("Wrong input. Enter a number between 10 and 99");
      }

      String digit1 = stringNum.substring(0, 1);
      String digit2 = stringNum.substring(1, 2);

      String[] arr = {digit1, digit2};
      
      for(String digit : arr) {
        digitTotal += Integer.parseInt(digit);
      }

      return digitTotal;
    }
}
