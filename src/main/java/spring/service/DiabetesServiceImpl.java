package spring.service;

import spring.exception.ResourceNotFoundException;
import spring.repository.DiabetesRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DiabetesServiceImpl implements DiabetesService {

    @Autowired
    private DiabetesRepository diabetesRepository;

    @Override
    @Transactional
    public List<Diabetes> getAll() {
        return diabetesRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Diabetes student) {
        diabetesRepository.save(student);
    }

    @Override
    @Transactional
    public Diabetes getById(Long id) throws ResourceNotFoundException {
        return diabetesRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(id));
    }

    @Override
    @Transactional
    public void delete(Long id){
        diabetesRepository.deleteById(id);
    }
}