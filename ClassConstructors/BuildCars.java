package ClassConstructors;

public class BuildCars {
  public static void main(String[] args) {

    Car car1 = new Car("Tesla", "Model X", true);
    Car car2 = new Car("BMW", "318d", false);
    Car car3 = new Car("Hyundi", "Tuscon", true);
    Car car4 = new Car("VW", "Beetle", false);

    Car car5 = Car.newCar("Toyota", "Supra");

    System.out.println(car1.toString());
    System.out.println(car2.toString());
    System.out.println(car3.toString());

    System.out.println(car4.getIsElectric());

    System.out.println(car5.toString());
  }

}
