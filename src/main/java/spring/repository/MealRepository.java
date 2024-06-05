package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Meal;

public interface MealRepository extends JpaRepository<Meal, Long> {
}
