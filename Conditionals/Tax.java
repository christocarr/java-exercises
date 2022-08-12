package Conditionals;

public class Tax {
  public static void main(String[] args) {
    
    double taxAmount = method2(50999);
    System.out.println(taxAmount);
  }

  public static double method1(int salary) {

    if(salary >= 15000 && salary <= 19999) {
      return 10;
    } else if( salary >= 20000 && salary <= 29999) {
      return 15;
    } else if( salary >= 30000 && salary <= 44999) {
      return 20;
    } else if( salary > 45000) {
      return 25;
    } else {
      return 0;
    }

  }

  public static double method2(int salary) {
    double tax = method1(salary);
    return (tax / 100) * salary;
  }
}
