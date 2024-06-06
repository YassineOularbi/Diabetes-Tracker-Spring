package spring.service.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.ExerciseNotFoundException;
import spring.model.exercise.Yoga;
import spring.repository.exercise.YogaRepository;

import java.util.List;

@Service
public class YogaService {

    @Autowired
    private YogaRepository yogaRepository;

    @Transactional
    public List<Yoga> getAll(){
        return yogaRepository.findAll();
    }

    @Transactional
    public Yoga save(Yoga yoga){
        return yogaRepository.save(yoga);
    }

    @Transactional
    public Yoga getById(Long id){
        return yogaRepository.findById(id).orElseThrow(ExerciseNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        yogaRepository.findById(id).orElseThrow(ExerciseNotFoundException::new);
        yogaRepository.deleteById(id);
    }
}
