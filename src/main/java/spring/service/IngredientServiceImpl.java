package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.model.Ingredient;
import spring.repository.IngredientRepository;

@Service
public class IngredientServiceImpl implements IngredientService{

    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    @Transactional
    public Ingredient save(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }
}
