package spring.service.measure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.enums.Status;
import spring.exception.MeasureNotFoundException;
import spring.model.Diabetic;
import spring.model.measure.Glycemia;
import spring.repository.measure.GlycemiaRepository;

import java.util.List;

@Service
public class GlycemiaService {

    @Autowired
    private GlycemiaRepository glycemiaRepository;

    @Transactional
    public List<Glycemia> getAll(Diabetic diabetic){
        return glycemiaRepository.findAllByDiabetic(diabetic);
    }

    @Transactional
    public Glycemia getLast(Diabetic diabetic){
        return glycemiaRepository.findFirstByDiabeticOrderByDateDesc(diabetic);
    }

    @Transactional
    public  String glycemiaDifference(Diabetic diabetic){
        Glycemia firstGlycemia = glycemiaRepository.findFirstByDiabeticOrderByDateAsc(diabetic);
        Glycemia lastGlycemia = glycemiaRepository.findFirstByDiabeticOrderByDateDesc(diabetic);
        Double firstValue = firstGlycemia.getValue();
        Double lastValue = lastGlycemia.getValue();
        Double difference = lastValue - firstValue;
        Double percentageChange = (difference / firstValue) * 100;
        return String.format("%.2f%% %s", percentageChange, percentageChange > 0 ? "more" : "less");

    }

    @Transactional
    public Glycemia save(Glycemia glycemia){
        if(glycemia.getValue()<20){
            glycemia.setStatus(Status.Low);
        } else if(glycemia.getValue()>20 & glycemia.getValue()<60){
            glycemia.setStatus(Status.Medium);
        } else {
            glycemia.setStatus(Status.High);
        }
        return glycemiaRepository.save(glycemia);
    }

    @Transactional
    public Glycemia getById(Long id){
        return glycemiaRepository.findById(id).orElseThrow(MeasureNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        glycemiaRepository.findById(id).orElseThrow(MeasureNotFoundException::new);
        glycemiaRepository.deleteById(id);
    }
}
