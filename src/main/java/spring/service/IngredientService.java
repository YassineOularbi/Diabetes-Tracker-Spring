package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.IngredientNotFoundException;
import spring.model.Ingredient;
import spring.repository.IngredientRepository;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Transactional
    public List<Ingredient> getAll() {
        return ingredientRepository.findAll();
    }

    @Transactional
    public Ingredient save(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Transactional
    public Ingredient getById(Long id) {
        return ingredientRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
    }

    @Transactional
    public void delete(Long id) {
        ingredientRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
        ingredientRepository.deleteById(id);
    }
}
