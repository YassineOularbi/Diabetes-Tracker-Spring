package spring.service.measure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.enums.Status;
import spring.exception.MeasureNotFoundException;
import spring.model.Diabetic;
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
    public BloodKetone getLast(Diabetic diabetic){
        return bloodKetoneRepository.findFirstByDiabeticOrderByDateDesc(diabetic);
    }

    @Transactional
    public BloodKetone save(BloodKetone bloodKetone){
        if(bloodKetone.getValue()<20){
            bloodKetone.setStatus(Status.Low);
        } else if(bloodKetone.getValue()>20 & bloodKetone.getValue()<60){
            bloodKetone.setStatus(Status.Medium);
        } else {
            bloodKetone.setStatus(Status.High);
        }
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
