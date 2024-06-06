package spring.service.measure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.MeasureNotFoundException;
import spring.model.measure.BloodKetone;
import spring.repository.measure.BloodKetoneRepository;

import java.util.List;

@Service
public class BloodKetoneService {

    @Autowired
    private BloodKetoneRepository bloodKetoneRepository;

    @Transactional
    public List<BloodKetone> getAll(){
        return bloodKetoneRepository.findAll();
    }

    @Transactional
    public BloodKetone save(BloodKetone bloodKetone){
        return bloodKetoneRepository.save(bloodKetone);
    }

    @Transactional
    public BloodKetone getById(Long id){
        return bloodKetoneRepository.findById(id).orElseThrow(MeasureNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        bloodKetoneRepository.findById(id).orElseThrow(MeasureNotFoundException::new);
        bloodKetoneRepository.deleteById(id);
    }
}
