package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.model.Nutrient;
import spring.repository.NutrientRepository;

@Service
public class NutrientServiceImpl implements NutrientService{

    @Autowired
    private NutrientRepository nutrientRepository;

    @Override
    @Transactional
    public Nutrient save(Nutrient nutrient) {
        return nutrientRepository.save(nutrient);
    }
}
