package spring.service.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.IngredientNotFoundException;
import spring.model.ingredient.SeaFruit;
import spring.repository.ingredient.SeaFruitRepository;

import java.util.List;

@Service
public class SeaFruitService {

    @Autowired
    private SeaFruitRepository seaFruitRepository;

    @Transactional
    public List<SeaFruit> getAll(){
        return seaFruitRepository.findAll();
    }

    @Transactional
    public SeaFruit save(SeaFruit seaFruit){
        return seaFruitRepository.save(seaFruit);
    }

    @Transactional
    public SeaFruit getById(Long id){
        return seaFruitRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        seaFruitRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
        seaFruitRepository.deleteById(id);
    }
}
