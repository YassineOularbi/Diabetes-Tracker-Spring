package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.DoctorNotFoundException;
import spring.model.Doctor;
import spring.repository.DoctorRepository;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Transactional
    public List<Doctor> getAll(){
        return doctorRepository.findAll();
    }

    @Transactional
    public Doctor save(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    @Transactional
    public Doctor getById(Long id){
        return doctorRepository.findById(id).orElseThrow(DoctorNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        doctorRepository.findById(id).orElseThrow(DoctorNotFoundException::new);
        doctorRepository.deleteById(id);
    }
}
