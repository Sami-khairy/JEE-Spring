package ma.khairy.mvcspring.repositories;

import ma.khairy.mvcspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
