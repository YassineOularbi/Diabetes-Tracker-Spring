package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Medication;

public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
