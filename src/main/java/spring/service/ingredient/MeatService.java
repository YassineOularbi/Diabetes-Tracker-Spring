package spring.service.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.IngredientNotFoundException;
import spring.model.ingredient.Meat;
import spring.repository.ingredient.MeatRepository;

import java.util.List;

@Service
public class MeatService {

    @Autowired
    private MeatRepository meatRepository;

    @Transactional
    public List<Meat> getAll(){
        return meatRepository.findAll();
    }

    @Transactional
    public Meat save(Meat meat){
        return meatRepository.save(meat);
    }

    @Transactional
    public Meat getById(Long id){
        return meatRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        meatRepository.findById(id).orElseThrow(IngredientNotFoundException::new);
        meatRepository.deleteById(id);
    }
}
