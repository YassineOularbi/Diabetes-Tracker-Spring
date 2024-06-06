package spring.service.medication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.MedicationNotFoundException;
import spring.model.medication.Pill;
import spring.repository.medication.PillRepository;

import java.util.List;

@Service
public class PillService {

    @Autowired
    private PillRepository pillRepository;

    @Transactional
    public List<Pill> getAll(){
        return pillRepository.findAll();
    }

    @Transactional
    public Pill save(Pill pill){
        return pillRepository.save(pill);
    }

    @Transactional
    public Pill getById(Long id){
        return pillRepository.findById(id).orElseThrow(MedicationNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        pillRepository.findById(id).orElseThrow(MedicationNotFoundException::new);
        pillRepository.deleteById(id);
    }
}

