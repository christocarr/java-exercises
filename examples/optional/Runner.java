package examples.optional;

import java.util.Optional;

public class Runner {

	public static void main(String[] args) {
		ProductRepository repository = new ProductRepository();
		
	
		Optional<Product> optional = repository.findById(1l);
		
		if(optional.isPresent()) {
			Product p = optional.get();
		}
	}

}
