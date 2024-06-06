package spring.repository.measure;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.measure.Glycemia;

public interface GlycemiaRepository extends JpaRepository<Glycemia, Long> {
}
