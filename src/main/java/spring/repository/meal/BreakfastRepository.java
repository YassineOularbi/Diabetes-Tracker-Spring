package spring.repository.meal;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.meal.Breakfast;

public interface BreakfastRepository extends JpaRepository<Breakfast, Long> {
}
