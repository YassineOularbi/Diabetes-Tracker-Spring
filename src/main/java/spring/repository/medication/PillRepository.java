package spring.repository.medication;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.medication.Pill;

public interface PillRepository extends JpaRepository<Pill, Long> {
}
