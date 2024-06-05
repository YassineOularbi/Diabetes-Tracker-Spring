package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
