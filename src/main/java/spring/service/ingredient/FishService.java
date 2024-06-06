package spring.service.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.IngredientNotFoundException;
import spring.model.ingredient.Fish;
import spring.repository.ingredient.FishRepository;

import java.util.List;

@Service
public class FishService {

    @Autowired
    private FishRepository fishRepository;

    @Transactional
    public List<Fish> getAll(){
        return fishRepository.findAll();
    }

    @Transactional
    public Fish save(Fish fish){
        return fishRepository.save(fish);
    }

    @Transactional
    public Fish getById(Long id){
        return fishRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        fishRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
        fishRepository.deleteById(id);
    }
}
