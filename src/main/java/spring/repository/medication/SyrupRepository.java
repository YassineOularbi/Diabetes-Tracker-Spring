package spring.repository.medication;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.medication.Syrup;

public interface SyrupRepository extends JpaRepository<Syrup, Long> {
}
