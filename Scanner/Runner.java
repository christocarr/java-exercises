package Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    ArrayList<Person> people = new ArrayList<>();

    boolean isNotQuit = true;

    while(isNotQuit) {
      System.out.print("What is your name? ");
      String name = sc.next();
  
      System.out.print("What is your age? ");
      int age = Integer.parseInt(sc.next());
  
      System.out.print("What is your job title? ");
      String jobTitle = sc.next();
  
      Person p1 = new Person(name, age, jobTitle);

      people.add(p1);

      System.out.print("Quit? (Y, N)");
      String quit = sc.next();

      if(quit.equals("y") || quit.equals("Y")) {
        isNotQuit = false;
      }

      sc.close();
    }
  
    for(Person person : people) {
      System.out.println(person.toString());
    }
    
  }
  
}
