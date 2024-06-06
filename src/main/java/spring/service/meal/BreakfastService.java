package spring.service.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.model.meal.Breakfast;
import spring.repository.meal.BreakfastRepository;

import java.util.List;

@Service
public class BreakfastService {

    @Autowired
    private BreakfastRepository breakfastRepository;

    @Transactional
    public List<Breakfast> getAll(){
        return breakfastRepository.findAll();
    }
}
