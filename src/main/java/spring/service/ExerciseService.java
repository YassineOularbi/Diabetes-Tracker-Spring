package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.ExerciseNotFoundException;
import spring.model.Exercise;
import spring.repository.ExerciseRepository;

import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Transactional
    public List<Exercise> getAll(){
        return exerciseRepository.findAll();
    }

    @Transactional
    public Exercise save(Exercise exercise){
        return exerciseRepository.save(exercise);
    }

    @Transactional
    public Exercise getById(Long id){
        return exerciseRepository.findById(id).orElseThrow(ExerciseNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        exerciseRepository.findById(id).orElseThrow(ExerciseNotFoundException::new);
        exerciseRepository.deleteById(id);
    }
}
