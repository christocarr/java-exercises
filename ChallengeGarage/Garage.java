package ChallengeGarage;

import java.util.ArrayList;

public class Garage {
  private ArrayList<Vehicle> garage;

  public Garage(ArrayList<Vehicle> vehicles) {
    garage = new ArrayList<>(vehicles) ;
  }

  public void generateBill() {
    for(Vehicle v : garage) {
      if(v instanceof Car) {
        System.out.printf("This car with id %d has a bill of %d", v.getId(), v.repairCost());
      }

      if(v instanceof Motorbike) {
        System.out.printf("This motorbike with id %d has a bill of %d", v.getId(), v.repairCost());
      }

    }
  }
}
