package spring.repository.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.ingredient.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Long> {
}
