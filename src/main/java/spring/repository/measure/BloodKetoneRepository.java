package spring.repository.measure;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Diabetic;
import spring.model.measure.BloodKetone;

public interface BloodKetoneRepository extends JpaRepository<BloodKetone, Long> {
    BloodKetone findFirstByDiabeticOrderByDateDesc(Diabetic diabetic);
}
