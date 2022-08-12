package ChallengeGarage;


public abstract class Vehicle {
  private int id;
  private String name;
  private int numberOfWheels;
  private String make;
  private String model;
  
  public Vehicle(int id, String name, int numberOfWheels, String make, String model) {
    this.id = id;
    this.name = name;
    this.numberOfWheels = numberOfWheels;
    this.make = make;
    this.model = model;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

  public int getNumberOfWheels() {
    return numberOfWheels;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  abstract double repairCost();
}