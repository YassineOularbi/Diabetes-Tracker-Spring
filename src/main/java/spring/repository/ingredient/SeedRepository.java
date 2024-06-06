package spring.repository.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.ingredient.Seed;

public interface SeedRepository extends JpaRepository<Seed, Long> {
}
