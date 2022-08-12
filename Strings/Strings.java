package Strings;

public class Strings {
  public static void main(String[] args) {
    // String a = "yesterday it was raining";
    // String b = "today it is sunny";

    // String c = a + ", " + b;

    // System.out.println(c.toUpperCase());

    int count = method1("yesterday it was raining cats and dogs");
    System.out.println(count);
    
  }

  private static int method1(String str) {
    int count = 1;
    for(int i = 0; i < str.length(); i++) {
      if(str.substring(i, i+1).equals(" ")) {
        count++;
      }
    }
    return count;
  }
}
