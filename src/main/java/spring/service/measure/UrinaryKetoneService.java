package spring.service.measure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.exception.MeasureNotFoundException;
import spring.model.measure.UrinaryKetone;
import spring.repository.measure.UrinaryKetoneRepository;

import java.util.List;

@Service
public class UrinaryKetoneService {

    @Autowired
    private UrinaryKetoneRepository urinaryKetoneRepository;

    @Transactional
    public List<UrinaryKetone> getAll(){
        return urinaryKetoneRepository.findAll();
    }

    @Transactional
    public UrinaryKetone save(UrinaryKetone urinaryKetone){
        return urinaryKetoneRepository.save(urinaryKetone);
    }

    @Transactional
    public UrinaryKetone getById(Long id){
        return urinaryKetoneRepository.findById(id).orElseThrow(MeasureNotFoundException::new);
    }

    @Transactional
    public void delete(Long id){
        urinaryKetoneRepository.findById(id).orElseThrow(MeasureNotFoundException::new);
        urinaryKetoneRepository.deleteById(id);
    }
}
