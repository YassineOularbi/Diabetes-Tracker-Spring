package spring.repository.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.ingredient.Fish;

public interface FishRepository extends JpaRepository<Fish, Long> {
}
