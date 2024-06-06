package spring.service.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.IngredientNotFoundException;
import spring.model.ingredient.Fruit;
import spring.repository.ingredient.FruitRepository;

import java.util.List;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    @Transactional
    public List<Fruit> getAll(){
        return fruitRepository.findAll();
    }

    @Transactional
    public Fruit save(Fruit fruit){
        return fruitRepository.save(fruit);
    }

    @Transactional
    public Fruit getById(Long id){
        return fruitRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        fruitRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
        fruitRepository.deleteById(id);
    }
}
