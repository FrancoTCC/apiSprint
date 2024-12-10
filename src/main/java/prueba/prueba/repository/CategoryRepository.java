package prueba.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prueba.prueba.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
