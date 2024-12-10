package prueba.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prueba.prueba.entity.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<prueba.prueba.entity.Product, Long> {
    List<Product> findByCategoryId(Long categoryId);
}
