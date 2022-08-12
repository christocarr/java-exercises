package Inheritance.Vehicles;

public class Car extends Vehicle {
  
  private String color;

  public Car(int topSpeed, int numberOfWheels, String color) {
    super(topSpeed, numberOfWheels);
    this.color = color;
  }
}
