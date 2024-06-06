package spring.service.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.model.meal.Dinner;
import spring.repository.meal.DinnerRepository;

import java.util.List;

@Service
public class DinnerService {

    @Autowired
    private DinnerRepository dinnerRepository;

    @Transactional
    public List<Dinner> getAll(){
        return dinnerRepository.findAll();
    }

    @Transactional
    public Dinner save(Dinner dinner){
        return dinnerRepository.save(dinner);
    }
}
