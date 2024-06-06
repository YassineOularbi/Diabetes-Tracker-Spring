package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.MedicationNotFoundException;
import spring.model.Medication;
import spring.repository.MedicationRepository;

import java.util.List;

@Service
public class MedicationService {

    @Autowired
    private MedicationRepository medicationRepository;

    @Transactional
    public List<Medication> getAll(){
        return medicationRepository.findAll();
    }

    @Transactional
    public Medication save(Medication medication){
        return medicationRepository.save(medication);
    }

    @Transactional
    public Medication getById(Long id){
        return medicationRepository.findById(id).orElseThrow(MedicationNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        medicationRepository.findById(id).orElseThrow(MedicationNotFoundException::new);
        medicationRepository.deleteById(id);
    }
}
