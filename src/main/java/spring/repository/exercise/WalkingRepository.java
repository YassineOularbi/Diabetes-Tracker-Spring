package spring.repository.exercise;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.exercise.Walking;

public interface WalkingRepository extends JpaRepository<Walking, Long> {
}
