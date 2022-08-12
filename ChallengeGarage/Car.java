package ChallengeGarage;

import java.util.Random;

public class Car extends Vehicle {

  public Car(String make, String model, int id, String name, int numberOfWheels) {
    super(id, name, numberOfWheels, make, model);
    
  }

  public double repairCost() {
    Random ran = new Random();
    return ran.nextDouble(100, 500);
  }
  
}
