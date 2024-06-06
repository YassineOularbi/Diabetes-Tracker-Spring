package spring.repository.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.ingredient.Vegetable;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {
}
