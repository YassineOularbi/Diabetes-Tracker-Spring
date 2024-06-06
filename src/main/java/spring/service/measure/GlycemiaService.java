package spring.service.measure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.MeasureNotFoundException;
import spring.model.measure.Glycemia;
import spring.repository.measure.GlycemiaRepository;

import java.util.List;

@Service
public class GlycemiaService {

    @Autowired
    private GlycemiaRepository glycemiaRepository;

    @Transactional
    public List<Glycemia> getAll(){
        return glycemiaRepository.findAll();
    }

    @Transactional
    public Glycemia save(Glycemia glycemia){
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
