package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    long count();
}
