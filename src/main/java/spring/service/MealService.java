package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.MealNotFoundException;
import spring.model.Meal;
import spring.repository.MealRepository;

import java.util.List;

@Service
public class MealService {

    @Autowired
    private MealRepository mealRepository;

    @Transactional
    public List<Meal> getAll(){
        return mealRepository.findAll();
    }

    @Transactional
    public Meal save(Meal meal){
        return mealRepository.save(meal);
    }

    @Transactional
    public Meal getById(Long id){
        return mealRepository.findById(id).orElseThrow(MealNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        mealRepository.findById(id).orElseThrow(MealNotFoundException::new);
        mealRepository.deleteById(id);
    }
}
