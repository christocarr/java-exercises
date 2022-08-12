package Scanner;

public class Person {
  private String name;
  private int age;
  private String jobTitle;

  public Person(String name, int age, String jobString) {
    this.name = name;
    this.age = age;
    this.jobTitle = jobString;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getJobTitle() {
    return jobTitle;
  }

 public void setJobTitle(String jobTitle){
   this.jobTitle = jobTitle;
 }

  @Override
  public String toString() {
    String output = "Name: " + name +  " has job title of " + jobTitle +  " and is the age of " + age;
    return output;
  }
}
