package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
