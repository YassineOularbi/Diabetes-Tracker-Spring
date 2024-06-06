package spring.service.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.IngredientNotFoundException;
import spring.model.meal.Lunch;
import spring.repository.meal.LunchRepository;

import java.util.List;

@Service
public class LunchService {

    @Autowired
    private LunchRepository lunchRepository;

    @Transactional
    public List<Lunch> getAll(){
        return lunchRepository.findAll();
    }

    @Transactional
    public Lunch save(Lunch lunch){
        return lunchRepository.save(lunch);
    }

    @Transactional
    public Lunch getById(Long id){
        return lunchRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        lunchRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
        lunchRepository.deleteById(id);
    }
}
