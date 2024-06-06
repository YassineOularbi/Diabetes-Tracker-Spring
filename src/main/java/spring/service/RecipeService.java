package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.RecipeNotFoundException;
import spring.model.Recipe;
import spring.repository.RecipeRepository;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Transactional
    public List<Recipe> getAll(){
        return recipeRepository.findAll();
    }

    @Transactional
    public Recipe save(Recipe recipe){
        return recipeRepository.save(recipe);
    }

    @Transactional
    public Recipe getById(Long id){
        return recipeRepository.findById(id).orElseThrow(RecipeNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        recipeRepository.findById(id).orElseThrow(RecipeNotFoundException::new);
        recipeRepository.deleteById(id);
    }
}
