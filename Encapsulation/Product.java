package Encapsulation;

public class Product {
  private String id;
  private String name;
  private double costPrice;
  private double retailPrice;

  public Product() {
    
  }

  private Product(String id, String name, double costPrice, double retailPrice) {
    this.id = id;
    this.name = name;
    this.costPrice = costPrice;
    this.retailPrice = retailPrice;
  }

  public static Product createProduct(String id, String name, double costPrice, double retailPrice) {
    return new Product(id, name, costPrice, retailPrice);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCostPrice() {
    return costPrice;
  }

  public void setCostPrice(double costPrice) {
    this.costPrice = costPrice;
  }

  public double getRetailPrice() {
    return retailPrice;
  }

  public void setRetailPrice(double retailPrice) {
    this.retailPrice = retailPrice;
  }
}
