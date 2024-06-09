package spring.service.measure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.MeasureNotFoundException;
import spring.model.Diabetic;
import spring.model.measure.A1C;
import spring.model.measure.Weight;
import spring.repository.measure.WeightRepository;

import java.util.List;

@Service
public class WeightService {

    @Autowired
    private WeightRepository weightRepository;

    @Transactional
    public List<Weight> getAll(){
        return weightRepository.findAll();
    }

    @Transactional
    public Weight getLast(Diabetic diabetic){
        return weightRepository.findFirstByDiabeticOrderByDateDesc(diabetic);
    }

    @Transactional
    public Weight save(Weight weight){
        return weightRepository.save(weight);
    }

    @Transactional
    public Weight getById(Long id){
        return weightRepository.findById(id).orElseThrow(MeasureNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        weightRepository.findById(id).orElseThrow(MeasureNotFoundException::new);
        weightRepository.deleteById(id);
    }
}
