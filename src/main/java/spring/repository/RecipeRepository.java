package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Recipe;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
