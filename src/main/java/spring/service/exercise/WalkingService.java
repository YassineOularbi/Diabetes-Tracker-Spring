package spring.service.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.ExerciseNotFoundException;
import spring.model.exercise.Walking;
import spring.repository.exercise.WalkingRepository;

import java.util.List;

@Service
public class WalkingService {

    @Autowired
    private WalkingRepository walkingRepository;

    @Transactional
    public List<Walking> getAll(){
        return walkingRepository.findAll();
    }

    @Transactional
    public Walking save(Walking walking){
        return walkingRepository.save(walking);
    }

    @Transactional
    public Walking getById(Long id){
        return walkingRepository.findById(id).orElseThrow(ExerciseNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        walkingRepository.findById(id).orElseThrow(ExerciseNotFoundException::new);
        walkingRepository.deleteById(id);
    }
}
