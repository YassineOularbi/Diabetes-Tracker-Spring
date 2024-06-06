package spring.repository.exercise;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.exercise.Swimming;

public interface SwimmingRepository extends JpaRepository<Swimming, Long> {
}
