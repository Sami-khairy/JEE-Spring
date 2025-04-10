package ma.khairy.mvcspring;

import ma.khairy.mvcspring.entities.Product;
import ma.khairy.mvcspring.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MvcSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcSpringApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            Product product = Product.builder()
                    .name("Computer").price(5400).quantity(50)
                    .build();
            productRepository.save(product);

            productRepository.save(Product.builder().name("Printer").price(5000).quantity(100).build());
            productRepository.save(Product.builder().name("SmartPhone").price(2500).quantity(61).build());

            productRepository.findAll().forEach(System.out::println);

        };
    }

}
