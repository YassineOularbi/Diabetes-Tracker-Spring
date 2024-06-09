package spring.repository.measure;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Diabetic;
import spring.model.measure.Glycemia;

import java.util.List;

public interface GlycemiaRepository extends JpaRepository<Glycemia, Long> {
    List<Glycemia> findAllByDiabetic(Diabetic diabetic);
    Glycemia findFirstByDiabeticOrderByDateDesc(Diabetic diabetic);
    Glycemia findFirstByDiabeticOrderByDateAsc(Diabetic diabetic);
}
