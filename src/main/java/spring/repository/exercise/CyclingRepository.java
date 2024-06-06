package spring.repository.exercise;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.exercise.Cycling;

public interface CyclingRepository extends JpaRepository<Cycling, Long> {
}
