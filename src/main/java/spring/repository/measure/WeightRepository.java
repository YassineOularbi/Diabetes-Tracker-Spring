package spring.repository.measure;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.measure.Weight;

public interface WeightRepository extends JpaRepository<Weight, Long> {
}
