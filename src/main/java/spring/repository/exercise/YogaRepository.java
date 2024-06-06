package spring.repository.exercise;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.exercise.Yoga;

public interface YogaRepository extends JpaRepository<Yoga, Long> {
}
