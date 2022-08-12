package EShop;

public class Customer {
  private String firstName;
  private String lastName;


  public Customer(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    
  }

  public void setName(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getName() 
  {
    return firstName + " " + lastName;
  }
}
