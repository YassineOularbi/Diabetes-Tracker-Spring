package spring.repository.meal;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.meal.Lunch;

public interface LunchRepository extends JpaRepository<Lunch, Long> {
}
