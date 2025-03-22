package ma.khairy.students_app;

import ma.khairy.students_app.entities.Product;
import ma.khairy.students_app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentsAppApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentsAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		productRepository.save(new Product(null,"Computer",4300.0,3));
//		productRepository.save(new Product(null,"Printer",1200.0,10));
//		productRepository.save(new Product(null,"Smart phone",2000.0,5));

		List<Product> products = productRepository.findAll();
		products.forEach(System.out::println);

		Product product = productRepository.findById(Long.valueOf(1)).get();
		System.out.println(product.toString());

		System.out.println(productRepository.findByNameContains("m"));

		System.out.println(productRepository.search("%m%"));

		System.out.println(productRepository.findByPriceGreaterThan(3000));

		System.out.println(productRepository.searchByPrice(3000));
	}
}