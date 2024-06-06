package spring.service.medication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.MedicationNotFoundException;
import spring.model.medication.Insulin;
import spring.repository.medication.InsulinRepository;

import java.util.List;

@Service
public class InsulinService {

    @Autowired
    private InsulinRepository insulinRepository;

    @Transactional
    public List<Insulin> getAll(){
        return insulinRepository.findAll();
    }

    @Transactional
    public Insulin save(Insulin insulin){
        return insulinRepository.save(insulin);
    }

    @Transactional
    public Insulin getById(Long id){
        return insulinRepository.findById(id).orElseThrow(MedicationNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        insulinRepository.findById(id).orElseThrow(MedicationNotFoundException::new);
        insulinRepository.deleteById(id);
    }
}
