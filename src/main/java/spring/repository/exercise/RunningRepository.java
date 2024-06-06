package spring.repository.exercise;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.exercise.Running;

public interface RunningRepository extends JpaRepository<Running, Long> {
}
