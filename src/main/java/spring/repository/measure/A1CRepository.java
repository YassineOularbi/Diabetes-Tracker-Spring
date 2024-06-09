package spring.repository.measure;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Diabetic;
import spring.model.measure.A1C;

public interface A1CRepository extends JpaRepository<A1C, Long> {
    A1C findFirstByDiabeticOrderByDateDesc(Diabetic diabetic);
}
