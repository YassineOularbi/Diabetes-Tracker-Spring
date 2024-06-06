package spring.service.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.ExerciseNotFoundException;
import spring.model.exercise.Running;
import spring.repository.exercise.RunningRepository;

import java.util.List;

@Service
public class RunningService {

    @Autowired
    private RunningRepository runningRepository;

    @Transactional
    public List<Running> getAll(){
        return runningRepository.findAll();
    }

    @Transactional
    public Running save(Running running){
        return runningRepository.save(running);
    }

    @Transactional
    public Running getById(Long id){
        return runningRepository.findById(id).orElseThrow(ExerciseNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        runningRepository.findById(id).orElseThrow(ExerciseNotFoundException::new);
        runningRepository.deleteById(id);
    }
}
