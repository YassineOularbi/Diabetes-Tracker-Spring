package spring.service.medication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.MedicationNotFoundException;
import spring.model.medication.Syrup;
import spring.repository.medication.SyrupRepository;

import java.util.List;

@Service
public class SyrupService {

    @Autowired
    private SyrupRepository syrupRepository;

    @Transactional
    public List<Syrup> getAll(){
        return syrupRepository.findAll();
    }

    @Transactional
    public Syrup save(Syrup syrup){
        return syrupRepository.save(syrup);
    }

    @Transactional
    public Syrup getById(Long id){
        return syrupRepository.findById(id).orElseThrow(MedicationNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        syrupRepository.findById(id).orElseThrow(MedicationNotFoundException::new);
        syrupRepository.deleteById(id);
    }
}
