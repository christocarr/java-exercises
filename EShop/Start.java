package EShop;

import java.util.ArrayList;
import java.util.Locale;

public class Start {
  
  public static void main(String[] args) {
    ArrayList<Product> products = new ArrayList<>();

    Customer c = new Customer("Chris", "Carr");

    Product p = new Product("coffee", 3.45);
    Product p2 = new Product("milk", 1.20);

    products.add(p);
    products.add(p2);

    System.out.println(c.getName());
    
    char currency = '£';

    for (Product product : products) {
      System.out.printf(Locale.UK, "Product : %s at %c%.2f %n", product.getName(), currency, product.getPrice());
    }

    System.out.printf("product count: %d %n", Product.getProductCount());

    
  
  }
}
