package spring.service.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.IngredientNotFoundException;
import spring.model.ingredient.Vegetable;
import spring.repository.ingredient.VegetableRepository;

import java.util.List;

@Service
public class VegetableService {

    @Autowired
    private VegetableRepository vegetableRepository;

    @Transactional
    public List<Vegetable> getAll(){
        return vegetableRepository.findAll();
    }

    @Transactional
    public Vegetable save(Vegetable vegetable){
        return vegetableRepository.save(vegetable);
    }

    @Transactional
    public Vegetable getById(Long id){
        return vegetableRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        vegetableRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
        vegetableRepository.deleteById(id);
    }
}
