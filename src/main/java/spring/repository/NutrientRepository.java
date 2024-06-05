package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Nutrient;

public interface NutrientRepository extends JpaRepository<Nutrient, Long> {
}
