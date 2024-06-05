package spring.repository;

import spring.entity.Diabetes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DiabetesRepository extends JpaRepository<Diabetes, Long> {

}

