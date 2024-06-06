package spring.repository.meal;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.meal.Dinner;

public interface DinnerRepository extends JpaRepository<Dinner, Long> {
}
