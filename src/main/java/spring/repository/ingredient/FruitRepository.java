package spring.repository.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.model.ingredient.Fruit;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

    @Query("SELECT f FROM Fruit f INNER JOIN f.nutrient n")
    List<Fruit> getAllFruitWithNutrient();
}
