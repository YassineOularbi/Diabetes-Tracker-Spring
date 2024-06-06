package spring.service.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.ExerciseNotFoundException;
import spring.model.exercise.Cycling;
import spring.repository.exercise.CyclingRepository;

import java.util.List;

@Service
public class CyclingService {

    @Autowired
    private CyclingRepository cyclingRepository;

    @Transactional
    public List<Cycling> getAll(){
        return cyclingRepository.findAll();
    }

    @Transactional
    public Cycling save(Cycling cycling){
        return cyclingRepository.save(cycling);
    }

    @Transactional
    public Cycling getById(Long id){
        return cyclingRepository.findById(id).orElseThrow(ExerciseNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        cyclingRepository.findById(id).orElseThrow(ExerciseNotFoundException::new);
        cyclingRepository.deleteById(id);
    }
}
