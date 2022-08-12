package Iteration;

public class Coins {
  public static void main(String[] args) {
    double cost = 5;
    double payment = 20.00;

    double change = payment - cost;

    System.out.println(change);

    int tenCount = 0;
    int fiveCount = 0;
    int twentyPCount = 0;
    int twoPCount = 0;

    while(change > 0.00) {

      if (change % 10 == 0) {
        tenCount++;
        change -= 10;
      }

      if (change % 5 == 0) {
        fiveCount++;
        change -= 5;
      }


      System.out.println(change);
    }

    System.out.printf("tenners: %s, fivers: %s", tenCount, fiveCount);  
  }
}
