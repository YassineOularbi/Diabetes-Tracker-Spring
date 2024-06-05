package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Measure;

public interface MeasureRepository extends JpaRepository<Measure, Long> {
}
