package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.DiabeticNotFoundException;
import spring.model.Diabetic;
import spring.repository.DiabeticRepository;

import java.util.List;

@Service
public class DiabeticService {

    @Autowired
    private DiabeticRepository diabeticRepository;

    @Transactional
    public List<Diabetic> getAll(){
        return diabeticRepository.findAll();
    }

    @Transactional
    public Diabetic save(Diabetic diabetic){
        return diabeticRepository.save(diabetic);
    }

    @Transactional
    public Diabetic getById(Long id){
        return diabeticRepository.findById(id).orElseThrow(DiabeticNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        diabeticRepository.findById(id).orElseThrow(DiabeticNotFoundException::new);
        diabeticRepository.deleteById(id);
    }
}
