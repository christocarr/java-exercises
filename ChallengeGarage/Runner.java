package ChallengeGarage;

import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    Car car1 = new Car("VW", "Beetle", 1, "Johnson", 4);

    Motorbike mb1 = new Motorbike("BMW", "Runner", 5, "Bond", 2);

    vehicles.add(car1);
    vehicles.add(mb1);

    Garage garage = new Garage(vehicles);
    garage.generateBill();
  }
}
