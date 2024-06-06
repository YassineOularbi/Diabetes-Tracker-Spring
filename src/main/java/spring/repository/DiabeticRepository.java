package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Diabetic;

public interface DiabeticRepository extends JpaRepository<Diabetic, Long> {
}
