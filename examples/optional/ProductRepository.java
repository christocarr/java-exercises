package examples.optional;

import java.util.Optional;

public class ProductRepository {
	public Optional<Product> findById(long productId) {
		Product product1 = new Product();
		
		Optional<Product> optionalProduct = Optional.of(product1);
		
		return optionalProduct;
	};
}
