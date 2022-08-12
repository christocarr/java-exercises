package Conditionals;

public class Conditionals {
  public static void main(String[] args) {

    // createFlowChart(100);
    int play = blackJack(21, 20);
    System.out.println(play);
  }

  private static void createFlowChart(int a) {
    if(a > 2000) {
      System.out.println("A");
      if(a > 6000) {
        System.out.println("C");
      } else {
        System.out.println("B");
        if(a > 4000) {
          System.out.println("D");
        } else {
          System.out.println("E");
        }
      }
    } else {
      System.out.println("1");
      if(a >100) {
        System.out.println("3");
        if(a > 600) {
          System.out.println("5");
        } else {
          System.out.println("4");
          if(a > 500) {
            System.out.println("6");
          } else {
            System.out.println("7");
          }
        }
      } else {
        System.out.println("2");
      }
    }
  }

  private static int blackJack(int i, int j) {
    
    int closest = 0;
    
    int i1 = Math.abs(i - 21);
    int j1 = Math.abs(j - 21);

    if(i1 > j1) {
      closest = j;
    } else {
      closest = i;
    }

    return closest;
  }
}
