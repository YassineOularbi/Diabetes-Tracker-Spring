package spring.repository.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.model.ingredient.Fish;

import java.util.List;

public interface FishRepository extends JpaRepository<Fish, Long> {

    @Query("SELECT f FROM Fish f INNER JOIN f.nutrient n")
    List<Fish> getAllFishWithNutrient();
}
