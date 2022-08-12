package Encapsulation;

public class BuildProducts {
  public static void main(String[] args) {
    Product product1 = Product.createProduct("cof1121","coffee", 2.99, 3.99);

    Product product2 = new Product();

    System.out.printf("Product %s with id %s costs %.2f and sells for %.2f. %n", product1.getName(), product1.getId(), product1.getCostPrice(), product1.getRetailPrice());

    System.out.printf("Product %s with id %s costs %.2f and sells for %.2f. %n", product2.getName(), product2.getId(), product2.getCostPrice(), product2.getRetailPrice());
  }
}
