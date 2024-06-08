package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Measure;

import java.sql.Date;
import java.util.List;

public interface MeasureRepository extends JpaRepository<Measure, Long> {
}
