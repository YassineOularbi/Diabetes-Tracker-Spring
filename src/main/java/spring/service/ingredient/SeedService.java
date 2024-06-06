package spring.service.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.IngredientNotFoundException;
import spring.model.ingredient.Seed;
import spring.repository.ingredient.SeedRepository;

import java.util.List;

@Service
public class SeedService {

    @Autowired
    private SeedRepository seedRepository;

    @Transactional
    public List<Seed> getAll(){
        return seedRepository.findAll();
    }

    @Transactional
    public Seed save(Seed seed){
        return seedRepository.save(seed);
    }

    @Transactional
    public Seed getById(Long id){
        return seedRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        seedRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
        seedRepository.deleteById(id);
    }
}
