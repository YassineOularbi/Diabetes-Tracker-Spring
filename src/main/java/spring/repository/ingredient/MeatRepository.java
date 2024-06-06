package spring.repository.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.ingredient.Meat;

public interface MeatRepository extends JpaRepository<Meat, Long> {
}
