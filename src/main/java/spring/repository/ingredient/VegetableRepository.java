package spring.repository.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.model.ingredient.Vegetable;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {
    Vegetable getVegetableByName(String name);

    @Query("SELECT v FROM Vegetable v INNER JOIN v.nutrient n")
    List<Vegetable> getAllVegetableWithNutrient();
}
