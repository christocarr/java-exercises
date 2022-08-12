package ChallengeGarage;

import java.util.Random;

public class Motorbike extends Vehicle {
  public Motorbike(String make, String model, int id, String name, int numberOfWheels) {
    super(id, name, numberOfWheels, make, model);
    
  }

  public double repairCost() {
    Random ran = new Random();
    return ran.nextDouble(50, 100);
  }
}
