package spring.repository.medication;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.medication.Insulin;

public interface InsulinRepository extends JpaRepository<Insulin, Long> {
}
