package EShop;

public class Product {
  private String name;
  private double price;
  private static int  productCount = 0;
  
  public Product(String name, double price)
  {
    this.name = name;
    this.price = price;
    productCount++;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public String getName()
  {
    return name;
  }

  public double getPrice()
  {
    return price;
  }

  public static int getProductCount()
  {
    return productCount;
  }
}
