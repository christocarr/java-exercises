package ClassConstructors;

public class Car {
  private String make;
  private String model;
  private boolean isElectric = false;

  private Car(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public Car(String make, String model, boolean isElectric) {
    this(make, model);
    this.isElectric = isElectric;
  }

  public static Car newCar(String make, String model) {
    return new Car(make, model);
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

  public Boolean getIsElectric() {
    return isElectric;
  }

  public void setIsElectric(boolean isElectric) {
    this.isElectric = isElectric;
  }

  @Override
  public String toString() {
    String electric ="electric";
    if (!getIsElectric()) {
      electric = "not electric";
    }
    
    String carString = String.format("This car is a %s which is a make of %s and is %s.", getModel(),  getMake(), electric);

    return carString;
  }
  
}
