package spring.service.measure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.enums.Status;
import spring.exception.MeasureNotFoundException;
import spring.model.Diabetic;
import spring.model.measure.A1C;
import spring.model.measure.BloodKetone;
import spring.repository.measure.A1CRepository;

import java.util.List;

@Service
public class A1CService {

    @Autowired
    private A1CRepository a1CRepository;

    @Transactional
    public List<A1C> getAll(){
        return a1CRepository.findAll();
    }

    @Transactional
    public A1C getLast(Diabetic diabetic){
        return a1CRepository.findFirstByDiabeticOrderByDateDesc(diabetic);
    }

    @Transactional
    public A1C save(A1C a1C){
        if(a1C.getValue()<20){
            a1C.setStatus(Status.Low);
        } else if(a1C.getValue()>20 & a1C.getValue()<60){
            a1C.setStatus(Status.Medium);
        } else {
            a1C.setStatus(Status.High);
        }
        return a1CRepository.save(a1C);
    }

    @Transactional
    public A1C getById(Long id){
        return a1CRepository.findById(id).orElseThrow(MeasureNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        a1CRepository.findById(id).orElseThrow(MeasureNotFoundException::new);
        a1CRepository.deleteById(id);
    }
}
