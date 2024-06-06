package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.MeasureNotFoundException;
import spring.model.Measure;
import spring.repository.MeasureRepository;

import java.util.List;

@Service
public class MeasureService {

    @Autowired
    private MeasureRepository measureRepository;

    @Transactional
    public List<Measure> getAll(){
        return measureRepository.findAll();
    }

    @Transactional
    public Measure save(Measure measure){
        return measureRepository.save(measure);
    }

    @Transactional
    public Measure getById(Long id){
        return measureRepository.findById(id).orElseThrow(MeasureNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        measureRepository.findById(id).orElseThrow(MeasureNotFoundException::new);
        measureRepository.deleteById(id);
    }
}
