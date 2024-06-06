package spring.repository.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.ingredient.SeaFruit;

public interface SeaFruitRepository extends JpaRepository<SeaFruit, Long> {
}
