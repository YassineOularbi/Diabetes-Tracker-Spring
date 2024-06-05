package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("studentRepository")
public interface DiabetesRepository extends JpaRepository<Diabetes, Long> {

}

