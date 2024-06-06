package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.NutrientNotFoundException;
import spring.model.Nutrient;
import spring.repository.NutrientRepository;

import java.util.List;

@Service
public class NutrientService{

    @Autowired
    private NutrientRepository nutrientRepository;

    public List<Nutrient> getAll() {
        return nutrientRepository.findAll();
    }

    @Transactional
    public Nutrient save(Nutrient nutrient) {
        return nutrientRepository.save(nutrient);
    }

    public Nutrient getById(Long id) {
        return nutrientRepository.findById(id).orElseThrow(NutrientNotFoundException::new);
    }

    public void delete(Long id) {
        nutrientRepository.findById(id).orElseThrow(NutrientNotFoundException::new);
        nutrientRepository.deleteById(id);
    }
}
