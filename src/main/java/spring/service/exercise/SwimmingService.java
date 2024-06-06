package spring.service.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.ExerciseNotFoundException;
import spring.model.exercise.Swimming;
import spring.repository.exercise.SwimmingRepository;

import java.util.List;

@Service
public class SwimmingService {

    @Autowired
    private SwimmingRepository swimmingRepository;

    @Transactional
    public List<Swimming> getAll(){
        return swimmingRepository.findAll();
    }

    @Transactional
    public Swimming save(Swimming swimming){
        return swimmingRepository.save(swimming);
    }

    @Transactional
    public Swimming getById(Long id){
        return swimmingRepository.findById(id).orElseThrow(ExerciseNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        swimmingRepository.findById(id).orElseThrow(ExerciseNotFoundException::new);
        swimmingRepository.deleteById(id);
    }
}
